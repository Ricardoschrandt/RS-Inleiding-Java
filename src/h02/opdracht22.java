package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht22 extends Applet {

    public void init() { }



    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawString("Ricardo", 100, 20);
        g.setColor(Color.red);
        g.drawString("Schrandt", 100, 30);
    }
}
