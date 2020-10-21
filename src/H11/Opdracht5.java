package H11;

import java.applet.*;
import java.awt.*;


public class Opdracht5 extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        int Cijfer = 0;
        int a = 5;
        int b = 5;
        int c = 15;
        int d = 15;

        while (Cijfer < 5) {
            Cijfer++;
            a += 15;
            b += 15;
            g.drawRect(a,b,c,d);
        }
    }
}
