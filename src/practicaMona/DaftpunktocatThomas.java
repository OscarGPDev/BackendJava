package practicaMona;

public class DaftpunktocatThomas extends Octocat {
    public DaftpunktocatThomas() {
        super("Daftpunktocat-Thomas",
                "Daftpunktocat-Thomas, wears a helmet like Thomas from Daftpunk.",
                "https://octodex.github.com/images/daftpunktocat-thomas.gif",
                true);
    }

    @Override
    public void action() {
        System.out.println("This octocat, came to this world to rule over electropop music.");
    }
}
