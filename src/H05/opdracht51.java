package H05;

import java.applet.Applet;
import java.awt.*;

        public class opdracht51 extends Applet{
            //declaratie.
            Color opvulkleur;
            Color lijnkleur;
            int breedte;
            int hoogte;
            int hoogte2;
            int cirkelbreedte;

            public void init() {
                //initialisatie.
                opvulkleur = Color.MAGENTA;
                lijnkleur = Color.BLACK;
                breedte = 200;
                hoogte = 100;
                cirkelbreedte = 100;

            }

            public void paint(Graphics g) {

                g.setColor(lijnkleur);
                g.drawLine(100, 60, 300, 60);
                g.drawString("lijn", 180, 80);

                g.setColor(opvulkleur);
                g.fillArc(550, 100, breedte, hoogte, 5, 45 );
                g.setColor(lijnkleur);
                g.drawOval(550, 100, breedte, hoogte );
                g.drawString("Taartpunt met ovaal eromheen", 570, 220);

                g.drawRect(100, 100, breedte, hoogte);

                g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
                g.drawString("Gevulde rechthoek met ovaal",330, 220);


                g.setColor(opvulkleur);
                g.fillRect(315, 100, breedte, hoogte);
                g.setColor(lijnkleur);
                g.drawString("RechtHoek",170, 220);

                g.setColor(lijnkleur);
                g.drawOval(315, 100, breedte, hoogte);
                g.drawString("Afgeronde Rechthoek",140, 350);

                g.setColor(opvulkleur);
                g.fillOval(315, 225, breedte, hoogte);
                g.setColor(lijnkleur);
                g.drawString("Gevulde Ovaal",370, 350);

                g.setColor(lijnkleur);
                g.drawOval(550, 225,cirkelbreedte,hoogte);
                g.drawString("Cirkel",580, 350);
            }

    }







