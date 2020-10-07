package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H103 extends Applet {
    Label Label;
    TextField MaandText;
    String StringMaand;
    String StringDagen;
    String Uitkomst;
    double Maand;

    public void init() {

        setSize(550, 250);
        Uitkomst = "";
        StringMaand = "Dit is geen maand";
        Label = new Label("Voer 1 t/m 12 in :");
        MaandText = new TextField("",10);
        MaandText.addActionListener(new Listener());
        add(Label);
        add(MaandText);
    }

    public void paint(Graphics g) {
        g.drawString(Uitkomst,20,50);
    }

    public class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StringMaand = MaandText.getText();
            Maand = Double.parseDouble(StringMaand);
            if (Maand == 1) {
                StringMaand = "Januari";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen:  " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 2) {
                StringMaand = "Februari";
                StringDagen = "28 of 29";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 3) {
                StringMaand = "Maart";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 4) {
                StringMaand = "April";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 5) {
                StringMaand = "Mei";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 6) {
                StringMaand = "Juni";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 7) {
                StringMaand = "Juli";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 8) {
                StringMaand = "Augustus";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 9) {
                StringMaand = "September";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 10) {
                StringMaand = "Oktober";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 11) {
                StringMaand = "November";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand == 12) {
                StringMaand = "December";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (Maand >= 13){
                Uitkomst = "Dit is geen maand";
            }
            repaint();
        }
    }
}

