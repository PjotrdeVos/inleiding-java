package H11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkH11 extends Applet{
    TextField Cijfer1;
    Button Enter;
    int Getal1,Uitkomst;

    public void init() {
        Cijfer1 = new TextField("",20);
        Enter = new Button("Enter.");
        Enter.addActionListener(new ButtonListener());
        add(Enter);
        add(Cijfer1);
    }

    public void paint (Graphics g) {
        g.drawString(Getal1 + "x1=" + Getal1 * 1 +"" ,50,20);
        g.drawString(Getal1 + "x2=" + Getal1 * 2 +"" ,50,50);
        g.drawString(Getal1 + "x3=" + Getal1 * 3 +"" ,50,80);
        g.drawString(Getal1 + "x4=" + Getal1 * 4 +"" ,50,110);
        g.drawString(Getal1 + "x5=" + Getal1 * 5 +"" ,50,140);
        g.drawString(Getal1 + "x6=" + Getal1 * 6 +"" ,50,170);
        g.drawString(Getal1 + "x7=" + Getal1 * 7 +"" ,50,200);
        g.drawString(Getal1 + "x8=" + Getal1 * 8 +"" ,50,230);
        g.drawString(Getal1 + "x9=" + Getal1 * 9 +"" ,50,260);
        g.drawString(Getal1 + "x10=" + Getal1 * 10 +"" ,50,290);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Cijfer1.getText();
            Getal1 = Integer.parseInt(s);

            repaint();
        }
    }
}