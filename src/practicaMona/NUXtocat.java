package practicaMona;

public class NUXtocat extends Octocat {
    public NUXtocat() {
        super("NUXtocat",
                "NUXtocat, is an octocat that is controlling an holographic butterfly and holds a display where is being displayed a hand shaking.",
                "https://octodex.github.com/images/NUX_Octodex.gif",
                true);
    }

    @Override
    public void action() {
        System.out.println("This octocat, controls an holographic butterfly");
    }
}
