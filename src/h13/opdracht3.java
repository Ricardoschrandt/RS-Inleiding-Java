package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

       Button beton,steen;
       boolean b,s;


       public void init(){
           beton = new Button("betonmuur");
           beton.addActionListener(new betonListener());
           add(beton);

           steen = new Button("stenenmuur");
           steen.addActionListener(new steenListener());
           add(steen);

       }

    class betonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           b = true;
           s = false;
           repaint();

          }
        }

    class steenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b = false;
            s = true;
            repaint();

        }
        }


        public void paint(Graphics g) {

            int x = 40;
            int y = 40;
            int breedte = 40;
            int hoogte = 40;


            if (s) {
                for (int teller = 0; teller < 20; teller++) {
                    x = 40;
                    for (int naampie = 0; naampie < 20; naampie++) {
                        g.setColor(Color.red);
                        g.fillRect(x, y, hoogte, breedte);
                        g.setColor(Color.white);
                        g.drawRect(x, y, hoogte, breedte);
                        x += breedte;
                    }
                    y += hoogte;
                }
            }


            if (b) {
                for (int teller = 0; teller < 20; teller++) {
                    x = 40;
                    for (int naampie = 0; naampie < 20; naampie++) {
                        g.setColor(Color.gray);
                        g.fillRect(x, y, hoogte, breedte);
                        g.setColor(Color.white);
                        g.drawRect(x, y, hoogte, breedte);
                        x += breedte;
                    }
                    y += hoogte;
                }
            }
        }
    }



