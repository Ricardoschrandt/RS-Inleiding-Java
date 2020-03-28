package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {

    public void init() { }

    public void paint(Graphics g){
        int teller;
        int x, y, lengte, breedte ;
        x  = 500;
        y = 300;
        lengte = 15;
        breedte = 15;

        for (teller = 0; teller < 50; teller++) {
            y -= 5;
            x -= 5;
            breedte += 10;
            lengte += 10;
            g.drawOval(x , y, lengte, breedte );

        }


    }



}
