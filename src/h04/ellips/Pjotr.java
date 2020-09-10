package h04.ellips;

import java.applet.Applet;
import java.awt.*;

public class Pjotr extends Applet {

    public void init() { setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawArc(100,100,100,50,500,500);
        g.fillArc(100,100,100,50,500,500);

    }
}