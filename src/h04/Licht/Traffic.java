package h04.DrieHoek;

import java.applet.Applet;
import java.awt.*;

public class Traffic extends Applet {

    public void init() { setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.drawRect(175,100,20,100);
        g.fillRect(175,100,20,100);

        g.setColor(Color.red);
        g.fillArc(172,100,25,25,0,360);

        g.setColor(Color.orange);
        g.fillArc(172,125,25,25,0,360);

        g.setColor(Color.green);
        g.fillArc(172,150,25,25,0,360);
    }
}