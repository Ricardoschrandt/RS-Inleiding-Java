package h6;

import java.applet.Applet;
import java.awt.*;

public class opdracht61 extends Applet {

        int a, e;
        double uitkomst;


        public void init() {

            e = 113;

            uitkomst = (e/4.0);
        }

        public void paint(Graphics g) {
            g.drawString("Ieder zijn eerlijke deel: " + uitkomst, 20, 100);
            g.drawString("Ricardo krijgt 28.25 euro", 20, 20);
            g.drawString("Jan krijgt 28.25 euro", 20, 40);
            g.drawString("Jeannette krijgt 28.25 euro", 20, 60);
            g.drawString("Ali krijgt 28.25 euro", 20, 80);
        }





}
