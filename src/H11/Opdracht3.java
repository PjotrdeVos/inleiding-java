package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht3 extends Applet{
    public void init() {}

    public void paint(Graphics g){
        int getal = 1;
        int getal2 = 1;
        int Tien = 10;

        while (getal < 100) {
            Tien += 30;
            g.drawString("" +  getal + " " + getal2,Tien,15);
            getal += getal2;
            getal2 += getal;
        }
    }
}
