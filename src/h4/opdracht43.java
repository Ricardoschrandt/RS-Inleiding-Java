package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(40,120, 120,20);
        g.setColor(Color.white);
        g.fillRect(40,140, 120,20);
        g.setColor(Color.blue);
        g.fillRect(40,160, 120,20);
        g.setColor(Color.black);
        g.fillRect(40, 120, 5, 200);

    }

}
