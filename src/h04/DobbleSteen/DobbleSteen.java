package h04.DrieHoek;

import java.applet.Applet;
import java.awt.*;

public class DobbleSteen extends Applet {

    public void init() { setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(20, 20, 100, 100, 10, 10);
        g.fillRect(20,20,100,100);

        g.setColor(Color.white);
        g.fillArc(20,20,25,25,0,360);

        g.setColor(Color.white);
        g.fillArc(100,20,25,25,0,360);

        g.setColor(Color.white);
        g.fillArc(20,100,25,25,0,360);

        g.setColor(Color.white);
        g.fillArc(100,100,25,25,0,360);



    }
}