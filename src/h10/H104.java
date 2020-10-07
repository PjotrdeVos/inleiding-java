package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H104 extends Applet {
    Label Label;
    TextField MaandText;
    TextField JaarText;
    String StringMaand;
    String StringDagen;
    String SJaar;
    String Uitkomst;
    double DMaand;
    double DJaar;

    public void init() {

        setSize(550, 250);
        Uitkomst = "";
        StringMaand = "Dit is geen maand";
        Label = new Label("Voor als Cijfers in / Maand - Jaar:");
        JaarText = new TextField("", 10);
        MaandText = new TextField("",10);
        MaandText.addActionListener(new Listener());
        JaarText.addActionListener(new Listener());
        add(Label);
        add(MaandText);
        add(JaarText);
    }

    public void paint(Graphics g) {
        g.drawString(Uitkomst,20,50);
    }

    public class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StringMaand = MaandText.getText();
            SJaar = JaarText.getText();
            DMaand = Double.parseDouble(StringMaand);
            DJaar = Double.parseDouble(SJaar);

            if ( (DJaar % 4 == 0 && !(DJaar % 100 == 0)) || DJaar % 400 == 0 && DMaand == 2) {
                StringMaand = "Februari";
                StringDagen = "29";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (!(DJaar % 4 == 0 && !(DJaar % 100 == 0)) || DJaar % 400 == 0 && DMaand == 2) {
                StringMaand = "Februari";
                StringDagen = "28";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 1) {
                StringMaand = "Januari";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen:  " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 3) {
                StringMaand = "Maart";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 4) {
                StringMaand = "April";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 5) {
                StringMaand = "Mei";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 6) {
                StringMaand = "Juni";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 7) {
                StringMaand = "Juli";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 8) {
                StringMaand = "Augustus";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 9) {
                StringMaand = "September";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 10) {
                StringMaand = "Oktober";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 11) {
                StringMaand = "November";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand == 12) {
                StringMaand = "December";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DMaand >= 13){
                Uitkomst = "Geen geldige maand";
            }
            repaint();
        }
    }
}