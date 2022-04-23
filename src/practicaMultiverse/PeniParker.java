package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class PeniParker extends SpiderMan implements ISPDR {
    public PeniParker() {
        super("Peni Parker", "SP//dr", "TRN704");
    }

    @Override
    public void describeSPDR(Screen s) {
        s.showImage("./peni_parker.gif");
        s.out("\n");
        s.out(this.spiderData(), "Fira Code Medium", 30, Colors.blue);
        s.out("\n");
        s.out("Vital Components:\n", "Fira Code Medium", 30, Colors.blue);
        for (String vc : vitalComponents) {
            s.out(" ->" + vc + "\n", "Fira Code Medium", 30, Colors.red);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
