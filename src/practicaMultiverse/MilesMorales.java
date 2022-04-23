package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class MilesMorales extends SpiderMan implements ISpiderMan {
    public MilesMorales() {
        super("Miles Morales", "SpiderMan", "TRN700");
    }

    @Override
    public void describeSpiderPowers(Screen s) {
        try {
            s.showImage("./spider-man-miles-morales.gif");
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
}
