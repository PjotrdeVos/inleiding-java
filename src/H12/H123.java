package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class H123 extends Applet{

    TextField input[] = new TextField[5];
    Button Enter;

    int cijfers[] = new int[5];

    public void init() {
        for(int i=0; i!=5; i++){
            input[i] = new TextField("",10);
            add(input[i]);
        }
        Enter = new Button("Enter");
        Enter.addActionListener(new ButtonListener());
        add(Enter);
    }

    public void paint(Graphics g) {

    }


    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for(int in = 0; in != 5; in++){
                cijfers[in] = Integer.parseInt(input[in].getText());

            }
            Arrays.sort(cijfers);
            for(int in = 0; in != 5; in++){
                input[in].setText(String.valueOf(cijfers[in]));
            }

        }
    }

}
