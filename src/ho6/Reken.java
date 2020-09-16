package ho6;

import java.awt.*;
import java.applet.*;


public class Reken extends Applet {
    double a, b;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst voor Jan is: " + uitkomst, 20, 20);
        g.drawString("De uitkomst voor Jeannette is: " + uitkomst, 20, 50);
        g.drawString("De uitkomst voor Ali is: " + uitkomst, 20, 80);
        g.drawString("De uitkomst voor Pjotr is: " + uitkomst, 20, 110);
    }
}