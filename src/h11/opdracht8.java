package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {

    public void paint (Graphics g) {

        int a = 20 , b = 20 ;

        for (int teller= 0 ; teller <= 100; teller++){

            a += 10;
            b += 10;

            g.drawOval(20,20,a, b);



        }



    }










}





