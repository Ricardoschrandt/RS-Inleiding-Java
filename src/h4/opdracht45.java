package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht45 extends Applet {


    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillArc(40, 40, 200, 100, 180, 90);
        g.setColor(Color.black);
        g.drawOval(40,40, 200, 100);
    }

}