package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht9 extends Applet {


    public void init() { }


    public void paint(Graphics g) {
      setBackground(Color.lightGray);

        int hoogte = 20;
        int breedte = 20;
        int y = 20;
        int x = 20;



            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }



           x = 20;
            y += hoogte;

           for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
               } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;

            }
         x = 20;
         y = 60;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 20;
        y = 80;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;

        }

        x = 20;
        y = 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 20;
        y = 120;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;

        }

        x = 20;
        y = 140;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 20;
        y = 160;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;

        }

    }
    }
