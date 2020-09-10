package h04.DrieHoek;

import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {

    public void init() { setBackground( new Color(51, 204, 255) );
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.drawRect(25,25,25,300);
        g.fillRect(25,25,25,300);
        // VlaggenPost

        g.setColor(Color.RED);
        g.drawRect(50,30,150,30);
        g.fillRect(50,30,150,30);
        // Vlag Rood

        g.setColor(Color.WHITE);
        g.drawRect(50,60,150,30);
        g.fillRect(50,60,150,30);
        // Vlag Wit

        g.setColor(Color.BLUE);
        g.drawRect(50,90,150,30);
        g.fillRect(50,90,150,30);
        // Vlag blauw

    }
}