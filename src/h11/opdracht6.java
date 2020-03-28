package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {


    public void init() {}



    public void paint(Graphics g) {
        int teller;
        int x, y, lengte, breedte ;
        x  = 60;
        y = 60;
        lengte = 25;
        breedte = 25;

       for (teller = 0; teller < 5;) {
            y += -6;
            x += -6;
            breedte += 12;
            lengte += 12;
            g.drawOval(x , y, lengte, breedte );
            teller++;
        }
    }
}
