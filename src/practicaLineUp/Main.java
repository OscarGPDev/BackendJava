package practicaLineUp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ImaginaryEvent e = new ImaginaryEvent();
        e.programShows(new Show[]{
                new Show("Diary of dreams", "E1", 1000),
                new Show("Lebanon Hanover", "E2", 2000),
                new Show("White Lies", "E3", 1000),
                new Show("Groundislava", "E2", 4000),
                new Show("Oscar and the Wolf", "E2", 2000),
                new Show("Brian Crain", "E2", 5000),
                new Show("Arkona", "E2", 3000),
                new Show("Philip Glass", "E1", 1500),
                new Show("Dead can Dance", "E3", 7000),
        });
        ArrayList<Thread> threads = new ArrayList<>();
        e.getShows().forEach((scene, shows) -> threads.add(new Thread(() -> {
            for (Show show : shows) {
                System.out.println("Now: " + show.getArtist() + " on " + scene);
                try {
                    Thread.sleep(show.getDuration());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        })));
        threads.forEach(Thread::start);

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
