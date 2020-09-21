import sun.rmi.runtime.NewThreadAction;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knop extends Applet {
    TextField tekstvak;
    Button Knop1;
    Button Knop2;
    String s;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        Knop1 = new Button("OK");
        Knop2 = new Button("RESET");
        Knop1.addActionListener( new TekstvakListener() );
        Knop2.addActionListener( new remover() );
        add(tekstvak);
        add(Knop1);
        add(Knop2);
        add(tekstvak);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    class TekstvakListener implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class remover implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText ("");
            s = "";
            repaint();
        }
    }
}