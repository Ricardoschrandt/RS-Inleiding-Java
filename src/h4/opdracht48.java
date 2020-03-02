package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht48 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){

        g.drawLine(0, 20, 200, 20);
        g.drawString("Lijn", 80, 40);

        g.setColor(Color.magenta);
        g.fillRect(0, 50, 200, 100);
        g.setColor(Color.black);
        g.drawOval(0, 50, 200, 100);
        g.drawString("Gevulde rechthoek met ovaal", 25, 180);

        g.drawOval(200, );

    }

}
