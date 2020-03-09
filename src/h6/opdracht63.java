package h6;

import java.applet.Applet;
import java.awt.Graphics;

public class opdracht63 extends Applet {

    int a, b, uitkomst ;

    public void init() {

        a = 7;
        b = 5;
        uitkomst = 5 - 7;

    }

    public void paint  (Graphics g) {
        g.drawString("5 - 7 = " + uitkomst , 50, 60 );



    }



}
