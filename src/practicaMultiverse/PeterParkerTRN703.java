package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class PeterParkerTRN703 extends SpiderMan implements ISpiderManNoir {
    public PeterParkerTRN703() {
        super("Peter Parker", "Spider-Man Noir", "TRN703");
    }

    @Override
    public void describeSpiderPowers(Screen s) {
        try {
            s.showImage("./spidernoir.gif");
            s.out("\n");
            s.out(this.spiderData(), "Fira Code Medium", 30, Colors.blue);
            s.out("\n");
            s.out("Powers:\n", "Fira Code Medium", 30, Colors.blue);
            for (String power : powers) {
                s.out(" ->" + power + "\n", "Fira Code Medium", 30, Colors.red);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void describeSpiderEquipment(Screen s) {
        try {
            s.out("Equipment:\n", "Fira Code Medium", 30, Colors.black);
            for (String e : equipments) {
                s.out(" -" + e + "\n", "Fira Code Medium", 30, Colors.red);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
