package H11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkH11 extends Applet{
    TextField Cijfer1;
    Button Enter;
    int Getal1,Uitkomst;

    public void init() {
        Cijfer1 = new TextField("",20);
        Enter = new Button("Enter.");
        Enter.addActionListener(new ButtonListener());
        add(Enter);
        add(Cijfer1);
    }

    public void paint (Graphics g) {

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Cijfer1.getText();
            Getal1 = Integer.parseInt(s);
            if (Getal1 == 1) {
                getGraphics().drawString(Getal1 + "x1=" + Getal1 * 1 +"" ,50,20);
                getGraphics().drawString("1x2=2",50,50);
                getGraphics().drawString("1x3=3",50,80);
                getGraphics().drawString("1x4=4",50,110);
                getGraphics().drawString("1x5=5",50,140);
                getGraphics().drawString("1x6=6",50,170);
                getGraphics().drawString("1x7=7",50,200);
                getGraphics().drawString("1x8=8",50,230);
                getGraphics().drawString("1x9=9",50,260);
                getGraphics().drawString("1x10=10",50,290);

            }




            if (Getal1 == 2) {
                getGraphics().drawString("2x1=2",50,20);
                getGraphics().drawString("2x2=4",50,50);
                getGraphics().drawString("2x3=6",50,80);
                getGraphics().drawString("2x4=8",50,110);
                getGraphics().drawString("2x5=10",50,140);
                getGraphics().drawString("2x6=12",50,170);
                getGraphics().drawString("2x7=14",50,200);
                getGraphics().drawString("2x8=16",50,230);
                getGraphics().drawString("2x9=18",50,260);
                getGraphics().drawString("2x10=20",50,290);

            }

        }
    }
}