package practicaMona;

public class Manufacturetocat extends Octocat {
    public Manufacturetocat() {
        super("Manufacturetocat",
                "Manufacturetocat, is an octocat that wears a yellow helmet, boots, security googles and a blue uniform, he is in a fabric.",
                "https://octodex.github.com/images/manufacturetocat.png",
                true);
    }

    @Override
    public void action() {
        System.out.println("This octocat manufacture GitHub actions... I think.");
    }
}
