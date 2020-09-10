package h04;

import java.applet.Applet;
import java.awt.*;

public class Diagram extends Applet {

    public void init() { setBackground(Color.WHITE );
        ;
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawRect(100, 250, 250, 0);
        g.fillRect(100, 250, 250, 0);
        // X

        g.setColor(Color.black);
        g.drawRect(100,0,0,250);
        g.fillRect(100,0,0,250);
        // Y

        g.setColor(Color.BLACK);
        g.drawString("  0",80,250);
        g.drawString(" 20",80,200);
        g.drawString(" 40",80,150);
        g.drawString(" 60",80,100);
        g.drawString(" 80",80,50);
        g.drawString("100",80,10);
        // Nummers ^^

        g.drawString("Valerie",100,275);
        g.drawString("Jeroen",200, 275);
        g.drawString("Hans",300,275);
        // Namen ^^

        g.setColor(Color.green);
        g.drawRect(100,150,50,100);
        g.fillRect(100,150,50,100);
        // Valerie ^^

        g.setColor(Color.blue);
        g.drawRect(200,0,50,250);
        g.fillRect(200,0,50,250);
        // Jeroen ^^

        g.setColor(Color.MAGENTA);
        g.drawRect(300,50,50,200);
        g.fillRect(300,50,50,200);
        // Hans ^^


    }
}