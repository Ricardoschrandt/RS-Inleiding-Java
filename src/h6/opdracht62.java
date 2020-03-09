package h6;

import java.applet.Applet;
import java.awt.Graphics;

public class opdracht62 extends Applet {

    int a, b, c, d, uitkomst2, uitkomst3, e, f ;
    double uitkomst;



    public void init() {

        a = 60;
        b = 60;
        uitkomst = a * b ;
        d = 24;
        c = 3600;
        uitkomst2 = d * c ;
        e = 86400;
        f = 365;
        uitkomst3 = e * f;
    }

    public void paint  (Graphics g) {
        g.drawString("Aantal seconden in een uur is " + uitkomst , 50, 60 );
        g.drawString("Aantal seconden in een dag is " + uitkomst2 , 50, 80 );
        g.drawString("Aantal seconden in een jaar is " + uitkomst3 , 50, 100 );

    }



}
