package practicaMona;

public class Main {
    public static void main(String[] args) {
        Octocat[] octocats = new Octocat[6];
        octocats[0] =new DaftpunktocatThomas();
        octocats[1] =new Manufacturetocat();
        octocats[2] =new NUXtocat();
        octocats[3] =new Octogatos();
        octocats[4] =new Sentrytocat();
        octocats[5] =new Yogitocat();
        for (Octocat octocat : octocats
             ) {
            System.out.println(octocat.fullData());
            System.out.println("******************");
        }
    }
}
