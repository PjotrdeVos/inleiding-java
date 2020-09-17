package ho6;

import java.awt.*;
import java.applet.*;


public class Cijfers extends Applet {
    double a, b, c;
    double uitkomst;



    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;

        uitkomst = (int)(uitkomst * 10);

        uitkomst = uitkomst / 10;

    }

    public void paint(Graphics g) {

        g.drawString("Het gemiddelde is" + uitkomst, 20, 20);
    }
}