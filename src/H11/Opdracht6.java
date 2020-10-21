package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht6 extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        int cijfer = 0;
        int x = 60;
        int y = 60;
        int c = 20;
        int d = 20;

        while (cijfer < 6) {
            cijfer++;
            x -= 5;
            y -= 5;
            c += 10;
            d += 10;
            g.drawArc(x,y,c,d,0,360);

        }

    }
}
