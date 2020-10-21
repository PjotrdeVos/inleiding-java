package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht9 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int w = 10;
        int h = 10;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {

                g.setColor(Color.white);
                g.fillRect(x, y, w, h);

            }
            x += w;

        }
        x = 50;
        y += 10;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {

                g.setColor(Color.white);
                g.fillRect(x, y, w, h);


            }
            x += h;

        }
        x = 50;
        y += 10;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {

                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += w;

        }
        x = 50;
        y += 10;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {

                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }
        x = 50;
        y += 10;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, w, h);
            } else {

                g.setColor(Color.white);
                g.fillRect(x, y, w, h);
            }
            x += h;
        }
    }
}