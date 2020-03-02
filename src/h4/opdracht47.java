package h4;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;

public class opdracht47 extends Applet {

    public void init() {
    }

    public void paint (Graphics g) {

        setBackground(Color.WHITE);
        g.drawRoundRect(20,20, 100,100, 45, 45);
        g.fillArc(35, 35, 25, 25, 180, 90);
        g.fillArc(35, 35, 25, 25, 90, 90);
        g.fillArc(35, 35, 25, 25, 360, 90);
        g.fillArc(35, 35, 25, 25, -90, 90);
        g.fillArc(80, 35, 25, 25, 180, 90);
        g.fillArc(80, 35, 25, 25, 90, 90);
        g.fillArc(80, 35, 25, 25, 360, 90);
        g.fillArc(80, 35, 25, 25, -90, 90);
        g.fillArc(80, 75, 25, 25, 180, 90);
        g.fillArc(80, 75, 25, 25, 90, 90);
        g.fillArc(80, 75, 25, 25, 360, 90);
        g.fillArc(80, 75, 25, 25, -90, 90);
        g.fillArc(35, 75, 25, 25, 180, 90);
        g.fillArc(35, 75, 25, 25, 90, 90);
        g.fillArc(35, 75, 25, 25, 360, 90);
        g.fillArc(35, 75, 25, 25, -90, 90);


    }


}
