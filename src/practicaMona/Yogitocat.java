package practicaMona;

public class Yogitocat extends Octocat {
    public Yogitocat() {
        super("Yogitocat",
                "Yogitocat, is an octocat that likes yoga, it's on  his tentacles.",
                "https://octodex.github.com/images/yogitocat.png",
                true);
    }

    @Override
    public void action() {
        System.out.println("This octocat does yoga and display his aura with leafs.");
    }
}
