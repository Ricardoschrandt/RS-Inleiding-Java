package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int vierkant;
        int x, y;
        x = 30;
        y = 50;
        for (vierkant = 0; vierkant < 5; vierkant++) {
            g.drawRect(x, y, 20, 20);
            x += 20;
            y += 20;
        }




    }
}