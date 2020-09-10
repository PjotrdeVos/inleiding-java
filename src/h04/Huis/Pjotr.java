package h04;

import java.applet.Applet;
import java.awt.*;

public class Pjotr extends Applet {

    public void init() { setBackground( new Color(51, 204, 255) );
        ;
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawPolygon(new int[] {100, 200, 300}, new int[]{100, 10, 100},3);
        g.fillPolygon(new int[] {100, 200, 300}, new int[]{100, 10, 100},3);
        //Dak ^^

        g.setColor(new Color(204, 142, 105) );
        g.drawRect(125,100,150,150);
        g.fillRect(125,100,150,150);
        //Huis ^^

        g.setColor(Color.GREEN);
        g.drawRect(0,250, 1000, 1000);
        g.fillRect(0,250, 1000,1000);
        // Gras ^^

        g.setColor(new Color(165,42,42));
        g.drawRect(210,150,50,90);
        g.fillRect(210,150,50,90);
        // Deur ^^

        g.setColor(new Color(35,172,196));
        g.drawRect(150,120,50,50);
        g.fillRect(150,120,50,50);
        // Raam ^^
    }
}