import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H101 extends Applet {

    TextField Tekstvak;
    double Tekst;
    double Getal;
    Label Label;
    String S;

    public void init() {

        Getal = 2;
        Tekstvak = new TextField("",10);
        Tekstvak.addActionListener(new Tekstvaklistener());
        Label = new Label("Voer een getal in en druk op enter!");

        add(Label);
        add(Tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Het getal" + Getal,20,50);
    }

    public class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Tekst = Double.parseDouble(S);
            if (Tekst > Getal) {
                Getal = Tekst;
            }
            repaint();
        }
    }

}