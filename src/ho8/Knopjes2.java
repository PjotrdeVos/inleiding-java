

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knopjes2 extends Applet {
    Button Knop1;
    Button Knop2;
    Button KnopM;
    Button KnopV;
    int counter;
    String s;
    String V;

    public void init() {
        Knop1 = new Button("+M");
        Knop2 = new Button("-M");
        KnopM = new Button("+V");
        KnopV = new Button("-V");
        Knop1.addActionListener(new TekstvakListener());
        Knop2.addActionListener(new remover());
        KnopM.addActionListener(new test());
        KnopV.addActionListener(new Vrouw());
        add(Knop1);
        add(Knop2);
        add(KnopM);
        add(KnopV);
        counter = 0;
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 70);
        g.drawString(V,180,70);
        g.drawString("Mannen", 30, 50);
        g.drawString("Vrouwen",180,50);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = "" + counter++;
            repaint();
        }
    }

    class remover implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = "" + counter--;
            repaint();
        }
    }
    class test implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            V = "" + counter++;
            repaint();

        }
    }
    class Vrouw implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            V = "" + counter--;
            repaint();

        }
    }
}