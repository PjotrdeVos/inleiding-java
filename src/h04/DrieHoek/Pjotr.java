package h04.DrieHoek;

import java.applet.Applet;
import java.awt.*;

public class Pjotr extends Applet {

    public void init() { setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawPolygon(new int[] {10, 20, 30}, new int[]{200, 20, 200},3);
        g.fillPolygon(new int[] {10, 20, 30}, new int[]{200, 20, 200},3);
    }
}