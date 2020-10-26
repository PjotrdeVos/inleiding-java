package H12;

import java.applet.*;
import java.awt.*;

public class H122 extends Applet{

    Button Button[] = new Button[25];

    public void init(){
        for (int Int = 0; Int != 25; Int++) {
            Button[Int] = new Button("Knop" + String.valueOf(Int + 1));
            add(Button[Int]);
        }
    }
}
