package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht8 extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        int cijfer = 0;
        int x = 0;
        int y = 0;
        int w = 20;
        int h = 20;

        while (cijfer < 100) {
            cijfer++;
            x = 0;
            y = 0;
            w += 10;
            h += 10;
            g.drawArc(x,y,w,h,0,360);

        }

    }
}
