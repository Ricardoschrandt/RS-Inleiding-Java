package H12;

import java.applet.*;
import java.awt.*;

public class opdracht1 extends Applet {

    double cijfer[];
    double totaal;
    int teller;



    public void init() {

        cijfer = new double[10];
        cijfer[0] = 1.0;
        cijfer[1] = 1.5;
        cijfer[2] = 2.3;
        cijfer[3] = 3.1;
        cijfer[4] = 3.9;
        cijfer[5] = 4.0;
        cijfer[6] = 5.8;
        cijfer[7] = 6.5;
        cijfer[8] = 8.9;
        cijfer[9] = 10.0;
        for (teller = 0; teller < cijfer.length; teller++) {
            totaal += cijfer[teller];
        }
        totaal /= teller;

    }

    public void paint(Graphics g) {

        for (int i = 0; i < cijfer.length; i++) {
            g.drawString("" + cijfer[i],50,20 * i + 20);
            g.drawString("het gemmidelde is " + totaal,100,20 );
        }




    }
}