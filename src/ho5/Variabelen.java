package ho5;

import java.applet.Applet;
import java.awt.*;

public class Variabelen extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 50;
        Valerie = 124;
        Jeroen = 64;
        Hans = 84;

    }

    public void paint(Graphics g) {
        g.drawString("100", 5, 65);
        g.drawString("80", 5, 85);
        g.drawString("60", 5, 105);
        g.drawString("40", 5, 125);
        g.drawString("20", 5, 145);
        g.drawString("0", 5, 165);

        g.drawLine(30, 180, 30, 40);
        g.drawLine(150, 180, 30, 180);

        g.setColor(Color.GREEN);
        g.drawRect(31, Valerie, 30, 55);
        g.fillRect(31, Valerie, 30, 55);

        g.setColor(Color.blue);
        g.drawRect(60, Jeroen, 30, 115);
        g.fillRect(60, Jeroen, 30, 115);

        g.setColor(Color.magenta);
        g.drawRect(90, Hans, 30, 95);
        g.fillRect(90, Hans, 30, 95);

        g.setColor(Color.black);
        g.drawString("Valerie", 20, 195);
        g.drawString("Jeroen", 60, 195);
        g.drawString("Hans", 100, 195);
    }


}