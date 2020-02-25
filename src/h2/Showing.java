package h2;//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Showing extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(30,30, 60, 60);
        g.drawLine(30, 30, 0, 60);
        g.drawLine(0, 60, 60, 60);

    }
}