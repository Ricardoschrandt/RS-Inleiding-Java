package h10;

import h8.opdracht3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1 extends Applet {
    // groups
    TextField tekstvak;
    int hoogstewaarde;

    // button
    public void init() {

        tekstvak = new TextField(25);
        WaardeListener waarde = new WaardeListener();
        tekstvak.addActionListener(waarde);
        add(tekstvak);


    }

    public void paint(Graphics g) {
        g.drawString("Hoogste Waarde is " + hoogstewaarde, 50, 45);

    }


    class WaardeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String A = tekstvak.getText();
            int getal1 = Integer.parseInt(A);
            if (getal1 > hoogstewaarde) {
                hoogstewaarde = getal1;
                repaint();
            }

        }

    }

}







