package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int teller;
        int cijfer = 1;
        int uitkomst;
        int y = 20;

        for (teller = 0; teller < 10; teller++) {
            uitkomst = cijfer * 3;
            g.drawString("uitkomst hiervan is: " + uitkomst, 20, y);
            cijfer++;
            y += 20;
        }


    }
}