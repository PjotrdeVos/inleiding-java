package ho6;

import java.awt.*;
import java.applet.*;


public class negatievgetal extends Applet {
    int a, b;
    double uitkomst;


    public void init() {
        setBackground(Color.black);
        a = 1;
        b = 6;
        uitkomst = a - b;
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("De uitkomst " + uitkomst, 40, 20);
    }
}