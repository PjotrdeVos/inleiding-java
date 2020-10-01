import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H102 extends Applet {
    
    TextField Tekstvak;
    double Tekst;
    double Getal
    String S;
    Label Label;
    double Laagstgetal;

    public void init() {


        Getal = 0;
        Laagstgetal = 0;
        Tekstvak = new TextField("",10);
        Tekstvak.addActionListener(new Tekstvaklistener());
        Label = new Label("voer een getal in");

        add(Label);
        add(Tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste : " + Getal,20,50);
        g.drawString("het laagste : " + Laagstgetal,20,70);
    }

    private class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Tekst = Double.parseDouble(S);
            if (Tekst > Getal ) {
                Getal = Tekst;
            }
            if (Tekst < Laagstgetal) {
                Laagstgetal = Tekst;
            }
            repaint();
        }
    }
}