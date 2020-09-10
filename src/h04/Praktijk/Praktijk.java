package h04.Praktijk;

import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);

        g.drawRoundRect(20,80, 100, 50, 10, 10);

        g.setColor(Color.magenta);
        g.fillRect(150,20,100,50);

        g.setColor(Color.BLACK);
        g.drawOval(150, 20, 100, 50);

        g.setColor(Color.magenta);
        g.fillOval(150, 80, 100, 50);

        g.setColor(Color.BLACK);
        g.drawOval(280, 20, 100, 50);

        g.setColor(Color.MAGENTA);
        g.fillArc(280, 20, 100, 50, 0, 45);

        g.setColor(Color.BLACK);
        g.drawArc(280,80,50,50,0,360);

        g.drawRect(20, 190, 100, 0);

        // Figuren ^^

        g.drawString(" Afgeronde rechthoek",20,150);
        g.drawString("Guvulde ovaal",150,150);
        g.drawString("Cirkel",280,150);
        g.drawString("Rechthoek",20,80);
        g.drawString("Rechthoek met ovaal",150,80);
        g.drawString("Taartpunt met ovaal",280,80);
        g.drawString("Lijn",20,210);




    }
}