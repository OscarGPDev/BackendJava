package practicaComic;

import imonsh.Screen;

public class Main {
    public static void main(String[] args) {
        Screen s = new Screen();
        s.setVisible(true);
        Thread t = new Thread(new SewayakiKitsuneNoSenkoSan(s));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("Eso ha sido todo!.");
    }
}
