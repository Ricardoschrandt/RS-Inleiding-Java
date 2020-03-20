package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    TextField tekst1,tekst2;
    double min, max, userinput;
    boolean geclicked;


    public void init() {
        tekst1 = new TextField(25);
        tekst1.addActionListener(new maxListener());
        add(tekst1);

    }


    public void paint(Graphics g) {

        g.drawString("Maximaal " + max,40,60);
        g.drawString("Minimaal " + min,35,80);

    }

    class maxListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String A = tekst1.getText();
            double getal1 = Double.parseDouble(A);
            if(geclicked == false){
            max = getal1;
            min = getal1;
            geclicked = true;
            }
            else {
                if (getal1 > max) {
                    max = getal1;
                }
                if (getal1 < min) {
                    min = getal1;
                }

            }
           repaint();
        }
    }









}
