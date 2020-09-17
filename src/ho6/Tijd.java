package ho6;

import java.awt.*;
import java.applet.*;


public class Tijd extends Applet {
    int a, b;
    int a1,b1,c1;
    int a2,b2,c2,d2,e2;
    int uitkomst;
    int uitkomst1;
    int uitkomst2;


    public void init() {
        a = 60;
        b = 60;
        uitkomst = a * b;

        a1 = 60;
        b1 = 60;
        c1 = 24;
        uitkomst1 = ( a1 * b1 ) * 24;

        a2 = 60;
        b2 = 60;
        c2 = 24;
        e2 = 365;
        uitkomst2 = a2 * b2 * c2 * e2;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in 1 uur is: " + uitkomst, 20, 20);
        g.drawString("Seconden", 190,20);

        g.drawString("Seconden in 1 dag is: " + uitkomst1,20,50);
        g.drawString("Seconden", 190,50);

        g.drawString("Seconden in 1 jaar is: " + uitkomst2,20,80);
        g.drawString("Seconden", 200,80);
    }
}
