package h13;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        boomTekenen(g);

    }

    public void boomTekenen(Graphics g) {

        Color Bruin = new Color(153, 102, 0);

        Color Groen = Color.green;
        Color boomstam = Bruin;

        int bladsize = 80;
        int x = 20;
        int y = 50;
        int hoogte = 120;
        int breedte = 50;
        int boomstamX = 35;
        int boomstamY = 110;

        for (int bosteller = 0; bosteller < 2; bosteller++) {
            //rij 1
            for (int rijteller = 0; rijteller < 5; rijteller++) {
                g.setColor(boomstam);
                g.fillRect(boomstamX, boomstamY, breedte, hoogte);
                g.setColor(Groen);
                g.fillOval(x, y, bladsize, bladsize);

                x += bladsize;
                boomstamX += bladsize;
            }
            //rij 2
            for (int tweederij = 0; tweederij < 4; tweederij++) {
                x = -15;
                y = 80;
                boomstamX = -5;
                boomstamY = 140;

                g.setColor(boomstam);
                g.fillRect(boomstamX, boomstamY, breedte, hoogte);
                g.setColor(Groen);
                g.fillOval(x, y, bladsize, bladsize);

                x += bladsize;
                boomstamX += bladsize;
                y += 30;
            }


        }
    }
}