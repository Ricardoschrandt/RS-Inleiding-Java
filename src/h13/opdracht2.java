package h13;

import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet{



    public void init(){

    }

    public void paint(Graphics g) {

        int x = 40;
        int y = 40;
        int breedte = 40;
        int hoogte = 40;

        message(g , x, y,  hoogte, breedte);
        }

        void message (Graphics g, int x, int y, int hoogte, int breedte ){
            for (int teller = 0; teller < 20; teller++ ){
             x = 40;
            for (int naampie = 0; naampie < 20; naampie++){
             g.setColor(Color.red);
             g.fillRect(x,y,hoogte,breedte);
             g.setColor(Color.white);
             g.drawRect(x,y,hoogte,breedte);
             x += breedte;
            }
                y +=hoogte;
            }



    }
}