package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H141 extends Applet {

    double rand1;
    double rand2;

    String kleur[] = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String betekenis[] = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
    String gekozen = "";
    Button kieskaart;

    public void init() {

        kieskaart = new Button("Kies een kaart");
        kieskaart.addActionListener(new Listener());
        add(kieskaart);
    }

    public void paint(Graphics g) {
        g.drawString(gekozen,50,50);
    }


    public class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rand1 = Math.random() * 12;
            int r1 = (int) rand1;
            rand2 = Math.random() * 3;
            int r2 = (int) rand2;

            gekozen = kleur[r2] + "" + betekenis[r1];

            repaint();
        }
    }
}