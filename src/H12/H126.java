package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H126 extends Applet{
    int Getallen[] = {1,1,1,1,2,2,2,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,8,9,9,9,9,10,10};
    Label Ltekst = new Label("Voer getal in tussen 1-10");
    TextField Tekst = new TextField("",20);
    Button Enter = new Button("Enter");

    int nummer = 0;
    int voorkomen = 0;

    public void init() {

        Enter.addActionListener(new Listener());
        add(Ltekst);
        add(Tekst);
        add(Enter);

    }

    public void paint(Graphics g) {
        g.drawString("Het getal komt   " + voorkomen + "    Keer voor   ", 20,70);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            voorkomen = 0;
            nummer = Integer.parseInt(Tekst.getText());
            for (int i = 0; i < Getallen.length; i++) {
                if (nummer == Getallen[i]) {
                    voorkomen++;
                }
            }
            repaint();

        }
    }

    }
