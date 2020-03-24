package h10;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht5 extends Applet {

    TextField tekstvak;
    String totaal, gemiddelde;
    Double cijfer;


    public void init() {

        tekstvak = new TextField("", 25);
        add(tekstvak);
        tekstvak.addActionListener(new globalListener());
        gemiddelde = "Voer uw cijfers in astublieft";

    }

    public void paint(Graphics g) {

        g.drawString(gemiddelde, 50, 50);

    }

    class globalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            cijfer = Double.parseDouble(userInput);


            if (cijfer < 5.5) {
                gemiddelde = "onvoldoende";
                repaint(); }

            else if (cijfer > 5.5) {
                gemiddelde = "voldoende";
                repaint();
            }

        }

    }
}
