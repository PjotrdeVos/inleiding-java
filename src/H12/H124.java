package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class H124 extends Applet {

    int getallen[] = {10, 15, 20, 25, 30, 35, 50, 60, 100, 130, 550,};
    Label tekst = new Label("Voer een getal in t/m 250");
    TextField input = new TextField("", 20);
    Button Enter = new Button("Enter!");

    int nummer;
    int index;
    boolean controle = false;


    public void init() {

        Enter.addActionListener(new EListener());
        add(tekst);
        add(input);
        add(Enter);

    }

    public void paint(Graphics g) {
        if (controle) {
            g.drawString("Het getal is" + index + "",75,20);
        } else {
            g.drawString("Getal niet gevonden",75,20);
        }
    }


    class EListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(input.getText());

            for(int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    index = i;
                    controle = true;
                }
            }
            repaint();

        }
    }
}