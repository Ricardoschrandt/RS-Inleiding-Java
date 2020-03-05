package H05;

import java.applet.Applet;
import java.awt.*;

public class opdracht52 extends Applet  {

    public void init() {}

    public void paint(Graphics g) {

        g.drawLine(200,40,200,200);
        g.drawLine(40,40,200,40);
        g.drawString("50kg", 10, 120);
        g.drawString("20kg", 10, 160);
        g.drawString("100kg", 5, 80);
        g.drawLine(40,200,200,200);
        g.drawLine(40,200,40,40);
        g.setColor(Color.red);
        g.fillRect(60,140, 20,60);
        g.setColor(Color.blue);
        g.fillRect(100,100, 20,100);
        g.setColor(Color.yellow);
        g.fillRect(140,80, 20,120);
        g.setColor(Color.black);
        g.drawString("Valarie 40kg", 10, 220);
        g.drawString("Jeroen 100kg", 10, 240);
        g.drawString("Hans 80kg", 10, 260);

    }



}
