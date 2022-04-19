package practicaMona;

public class Sentrytocat extends Octocat {
    public Sentrytocat() {
        super("Sentrytocat",
                "Sentrytocat, is a firefighter octocat.",
                "https://octodex.github.com/images/Sentrytocat_octodex.jpg",
                true);
    }

    @Override
    public void action() {
        System.out.println("This octocat, holds his firehose to take down the fire.");
    }
}
