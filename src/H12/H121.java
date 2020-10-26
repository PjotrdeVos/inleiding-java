package H12;

import java.applet.*;
import java.awt.*;

public class H121 extends Applet{


    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;
    double j;
    double uitkomst;
    double[] gemiddelde;


    public void init() {
        a = 5.9;
        b = 3.6;
        c = 6.6;
        d = 10;
        e = 2.3;
        f = 1.9;
        g = 6.9;
        h = 8.9;
        i = 9.4;
        j = 6.6;

        gemiddelde = new double[11];
        uitkomst = (a + b + c + d + e + f +g + h + i + j) / 10;

        gemiddelde[0] = a;
        gemiddelde[1] = b;
        gemiddelde[2] = c;
        gemiddelde[3] = d;
        gemiddelde[4] = e;
        gemiddelde[5] = f;
        gemiddelde[6] = g;
        gemiddelde[7] = h;
        gemiddelde[8] = i;
        gemiddelde[9] = j;
        gemiddelde[10] = uitkomst;

        for (int teller = 0; teller < gemiddelde.length; teller++) {


        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < gemiddelde.length; teller++) {
            g.drawString("" + gemiddelde[teller],40,50 * teller + 10);
        }
    }
}
