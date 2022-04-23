package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class GwendolynStacy extends SpiderMan implements ISpiderWoman {
    public GwendolynStacy() {
        super("Gwendolyn Stacy", "Spider-Woman", "TRN702");
    }

    @Override
    public void describeSpiderWoman(Screen s) {
        s.out(this.spiderData(), "Fira Code Medium", 30, Colors.blue);
        s.out("\n");
        s.out("Powers:\n", "Fira Code Medium", 30, Colors.blue);
        for (String power : powers) {
            s.out(" ->" + power + "\n", "Fira Code Medium", 30, Colors.red);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        s.showImage("./spider-woman.gif");
        s.out("\n");
    }
}
