package H11;

import java.applet.*;
import java.awt.*;


public class Opdracht4 extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        int getal = 0;
        int x = 10;
        int tafel;

        while(getal < 10) {
            x += 20;
            getal++;
            tafel = 3 * getal;
            g.drawString("" + tafel,x,10);
        }
    }


}
