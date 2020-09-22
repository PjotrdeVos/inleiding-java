import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BTW extends Applet {
    TextField tekstvak;
    String s;
    double a, b, getal, PrijsINC , BTW;
    Button OK;
    Button RESET;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new ButtonListener() );
        OK = new Button("OK");
        RESET = new Button("RESET");
        OK.addActionListener(new ButtonListener());
        RESET.addActionListener(new Reset());
        s = "";
        a = 100;
        b = 21;
        add(tekstvak);
        add(OK);
        add(RESET);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(PrijsINC), 50, 60 );
    }

    class ButtonListener implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s);
            BTW = (getal / a) * b;
            PrijsINC = BTW + PrijsINC;
            repaint();
        }
    }

    class Reset implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText ("");
            s = "";
            repaint();
        }
    }
}