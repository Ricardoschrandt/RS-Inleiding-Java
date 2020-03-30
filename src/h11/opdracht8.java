package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {

    public void paint (Graphics g) {

        int y = 20 , x = 20 ;

        for (int teller= 0 ; teller <= 100; teller++){

            y +=10;
            x +=10;

            g.drawOval(20,20,y, x);



        }



    }










}





