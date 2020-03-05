package H05;

import java.applet.Applet;
import java.awt.*;

public class opdracht52 extends Applet  {


    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int hoogtexas;

    public void init() {

        setSize(1000, 1000);
        gewichtValerie = 45;
        gewichtHans = 80;
        gewichtJeroen = 100;
        hoogtexas = 400;
    }

    public void paint(Graphics g) {
        g.drawString("50KG -", 60, 350 );
        g.drawString("100KG -", 50, 300 );

        // lijn links
        g.drawLine(100, 100, 100, hoogtexas);
        //lijn onder
        g.drawLine(400, 400, 100, hoogtexas);
        //lijn boven
        g.drawLine(400, 100, 100, 100);
        //lijn rechts
        g.drawLine(400, 100, 400, hoogtexas);
        //gewichtValerie
        g.setColor(Color.pink);
        g.fillRect(110, hoogtexas - gewichtValerie, 50, gewichtValerie );
        g.setColor(Color.black);
        g.drawString( "Valerie", 110, 420);
        //gewichtJeroen
        g.setColor(Color.blue);
        g.fillRect(180, hoogtexas - gewichtJeroen, 50 , gewichtJeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen",180, 420);
        //gewichtHans
        g.setColor(Color.red);
        g.fillRect( 250, hoogtexas - gewichtHans, 50, gewichtHans );
        g.setColor(Color.black);
        g.drawString("Hans",260, 420);
    }



}
