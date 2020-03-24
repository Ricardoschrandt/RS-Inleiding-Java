package h10;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {

    TextField tekstvak;
    String totaal, gemiddelde;
    int cijfer;


    public void init() {

        tekstvak = new TextField("", 25);
        add(tekstvak);
        tekstvak.addActionListener(new Praktijk.globalListener());
        gemiddelde = "Voer uw cijfers in astublieft";

    }

    public void paint(Graphics g) {

        g.drawString(gemiddelde, 50, 50);

    }

    class globalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            cijfer = Integer.parseInt(userInput);


            switch (cijfer) {

                case 1:
                case 2:
                case 3:
                    gemiddelde = "slecht"; repaint(); break;
                case 4:
                    gemiddelde = "onvoldoende"; repaint(); break;
                case 5:
                    gemiddelde = "matig"; repaint(); break;
                case 6:
                case 7:
                    gemiddelde = "voldoende"; repaint(); break;
                case 8:
                case 9:
                case 10:
                    gemiddelde = "goed"; repaint(); break;
            }
        }
            }






}
