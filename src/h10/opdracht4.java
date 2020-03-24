package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht4 extends Applet {

    TextField tekstvak;
    TextField tekstvak2;
    String s, tekst, response;
    int jaartal;
    Label label;


    public void init() {

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new maandListener());
        add(tekstvak);
        label = new Label("Type een jaartal in om te kijken of het een schrikkeljaar is: ");
        add(label);
        tekstvak2 = new TextField("", 20);
        tekstvak2.addActionListener(new ScrikkelListener());
        add(tekstvak2);
        tekst = "";





    }

    public void paint(Graphics g) {

        g.drawString(response, 50, 110);
        g.drawString(tekst, 50, 130);



    }

    class maandListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int maand = Integer.parseInt(s);
            if (maand < 1 || maand > 12) {
                response = "Dat is een ongeldig getal.";
            }

            switch (maand) {
                case 1: response = "Januari heeft 31 dagen."; repaint(); break;
                case 2: response = "Februari heeft 28 of 29 dagen."; repaint(); break;
                case 3: response = "Maart heeft 31 dagen."; repaint(); break;
                case 4: response = "April heeft 31 dagen."; repaint(); break;
                case 5: response = "Mei heeft 30 dagen."; repaint(); break;
                case 6: response = "Juni heeft 31 dagen."; repaint(); break;
                case 7: response = "Juli heeft 30 dagen."; repaint(); break;
                case 8: response = "August heeft 31 dagen."; repaint(); break;
                case 9: response = "September heeft 30 dagen."; repaint(); break;
                case 10: response = "Oktober heeft 31 dagen."; repaint(); break;
                case 11: response = "November heeft 30 dagen."; repaint(); break;
                case 12: response = "December heeft 31 dagen."; repaint(); break;


            }

        }
    }
    class ScrikkelListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            jaartal = Integer.parseInt(s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " Is een schrikkeljaar ";
            }
            else {
                tekst = "" + jaartal + " Is geen schrikkeljaar";
            }
            repaint();
        }
    }

}





