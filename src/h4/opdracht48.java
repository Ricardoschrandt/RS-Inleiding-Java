package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht48 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){

        g.drawLine(0, 20, 200, 20);
        g.drawString("Lijn", 80, 40);
        g.drawRect(0, 50, 200, 100);
        g.drawString("Rechthoek", 70, 170);
        g.setColor(Color.magenta);
        g.fillRect(200,50, 200, 100);
        g.setColor(Color.black);
        g.drawOval(200, 50, 200, 100);
        g.drawString("Gevulde rechthoek met ovaal", 220, 170);
        g.drawOval(400, 50, 200, 100 );
        g.setColor(Color.magenta);
        g.fillArc(400, 50, 200, 100, 5, 45 );
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",420, 170);
        g.drawRoundRect(0, 200, 200, 100, 45, 45);
        g.drawString("Afgeronde rechthoek", 50, 320);
        g.setColor(Color.magenta);
        g.fillOval(200, 200, 200, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde oval",250, 320 );
        g.drawOval(450, 200, 100, 100);
        g.drawString("Cirkel",480, 320);


    }

}
