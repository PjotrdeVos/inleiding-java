import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BTW extends Applet {
    TextField tekstvak;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type de prijs");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("De prijs inc BTW is" + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            repaint();
        }
    }
}