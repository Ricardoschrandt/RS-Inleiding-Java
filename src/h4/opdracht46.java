package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        g.fillRect(20, 20, 100, 200);
        g.setColor(Color.red);
        g.fillArc(40, 40, 50, 50, 180, 90);
        g.fillArc(40, 40, 50, 50, 90, 90);
        g.fillArc(40, 40, 50, 50, 360, 90);
        g.fillArc(40, 40, 50, 50, -90, 90);
        g.drawOval(40, 40, 50, 50);
        g.setColor(Color.yellow);
        g.drawOval(40, 100, 50, 50);
        g.fillArc(40, 100, 50, 50, 180, 90);
        g.fillArc(40, 100, 50, 50, 90, 90);
        g.fillArc(40, 100, 50, 50, 360, 90);
        g.fillArc(40, 100, 50, 50, -90, 90);
        g.setColor(Color.green);
        g.drawOval(40, 160, 50, 50);
        g.fillArc(40, 160, 50, 50, 180, 90);
        g.fillArc(40, 160, 50, 50, 90, 90);
        g.fillArc(40, 160, 50, 50, 360, 90);
        g.fillArc(40, 160, 50, 50, -90, 90);
    }






}
