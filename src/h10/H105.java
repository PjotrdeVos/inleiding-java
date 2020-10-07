package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H105 extends Applet {
    Label Label;
    TextField Tekst;
    Double Gemiddelde;
    int TotalCijfers;
    boolean Voldoende;
    Button Knop;

    public void init() {
        Label = new Label("Voer cijfer in");
        Tekst = new TextField("",5);
        Knop = new Button("Enter");
        Knop.addActionListener(new ActionKnop());
        TotalCijfers = 0;
        Gemiddelde = 0.0;
        add(Tekst);
        add(Label);
        add(Knop);

    }

    public void paint(Graphics g){
        g.drawString("Je gemiddelde   " + Gemiddelde,75,30);
        g.drawString("Voldoende?    " + Voldoende,75,50);
        g.drawString("Totaal cijfers    " + TotalCijfers,75,70);
    }

    public class ActionKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Double Cijfers = Double.parseDouble(Tekst.getText());
            Voldoende = Cijfers >= 5.5;

            // Dit heb ik met hulp gedaan
            Gemiddelde = ((Gemiddelde * Cijfers) + Cijfers) / (Cijfers + 1);
            Gemiddelde =  Gemiddelde * 10;
            Gemiddelde = Gemiddelde / 10;
            Cijfers++;
            repaint();

        }
    }
}
