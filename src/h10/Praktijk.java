package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {


    TextField TextField;

    Button Enter;

    int Getal;

    String Cijfer = "";


    public void init() {
        TextField = new TextField("", 5);
        Enter = new Button("Enter");
        Getal = 0;

        add(TextField);
        add(Enter);

        Enter.addActionListener(new KnopEnter());


    }
    public void paint(Graphics g) {
        g.drawString("Je cijfer is:" + Cijfer,50,50);

    }


    class KnopEnter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal = Integer.parseInt(TextField.getText());
            switch (Getal) {
                case 1:
                case 2:
                case 3:
                    Cijfer = "Slecht";
                    break;
                case 4:
                    Cijfer = "Onvoldoende";
                    break;
                case 5:
                    Cijfer = "Matig";
                    break;
                case 6:
                case 7:
                    Cijfer = "Voldoende!";
                    break;
                case 8:
                case 9:
                case 10:
                    Cijfer = "Goed!";
                    break;


            }
            repaint();
        }
    }
}



