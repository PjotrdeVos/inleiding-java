import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk extends Applet {
    TextField tekstvak,TekstVak1;
    double a, b, getal, getal1, Uitkomst;
    Button PLUS;
    Button MIN;
    Button KEER;
    Button DELEN;

    public void init() {
        tekstvak = new TextField("", 10);
        TekstVak1 = new TextField("",10);
        tekstvak.addActionListener( new ButtonListener());
        TekstVak1.addActionListener( new ButtonListener());
        PLUS = new Button("+");
        MIN = new Button("-");
        KEER = new Button("*");
        DELEN = new Button("/");
        PLUS.addActionListener(new ButtonListener());
        MIN.addActionListener( new ButtonListener1());
        KEER.addActionListener( new ButtonListener2());
        DELEN.addActionListener( new ButtonListener3());
        add(tekstvak);
        add(TekstVak1);
        add(PLUS);
        add(MIN);
        add(KEER);
        add(DELEN);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(Uitkomst), 50, 60 );
    }

    class ButtonListener implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String s1 = TekstVak1.getText();
            getal = Double.parseDouble(s);
            getal1 = Double.parseDouble(s1);
            Uitkomst = getal + getal1;
            repaint();
        }
    }
    class ButtonListener1 implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String s1 = TekstVak1.getText();
            getal = Double.parseDouble(s);
            getal1 = Double.parseDouble(s1);
            Uitkomst = getal - getal1;
            repaint();
        }
    }

    class ButtonListener2 implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String s1 = TekstVak1.getText();
            getal = Double.parseDouble(s);
            getal1 = Double.parseDouble(s1);
            Uitkomst = getal * getal1;
            repaint();
        }
    }
    class ButtonListener3 implements ActionListener    {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String s1 = TekstVak1.getText();
            getal = Double.parseDouble(s);
            getal1 = Double.parseDouble(s1);
            Uitkomst = getal / getal1;
            repaint();
        }
    }
}