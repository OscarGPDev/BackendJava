package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class Main{
    public static void main(String[] args) {
        SpiderMan[] spiders= new SpiderMan[]{
                new PeniParker(),
                new PeterParkerTRN703(),
                new MilesMorales(),
                new GwendolynStacy()
        };
        Screen s = new Screen();
        s.setVisible(true);


        try {
            ((PeniParker)spiders[0]).describeSPDR(s);
            Thread.sleep(6000);
            s.cls();
            ((PeterParkerTRN703)spiders[1]).describeSpiderPowers(s);
            ((PeterParkerTRN703)spiders[1]).describeSpiderEquipment(s);
            Thread.sleep(6000);
            s.cls();
            ((MilesMorales)spiders[2]).describeSpiderPowers(s);
            Thread.sleep(6000);
            s.cls();
            ((GwendolynStacy)spiders[3]).describeSpiderWoman(s);
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("xd");
    }
}
