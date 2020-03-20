package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    TextField tekstvak;
    String response;


    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak.addActionListener(new globalListener());
        response = "Loading";
    }

    public void paint(Graphics g) {
        g.drawString(response,50,100);
    }

    class globalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            int maand = Integer.parseInt(userInput);
            if (maand < 1 || maand > 12) {
                response = "Een getal van 1 tot 12 alstublieft.";
                repaint();
            }

            String maanden {"", "januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","december"};

      switch (maand) {
          case 1 :
          case 3:
          case 5:
          case 7 :
          case 9:
          case 11:
                    response = String maanden + (maand) = " heeft 31 dagen."; repaint();break;
          case 4:
              response = String maanden + (maand) = " heeft 28 dagen."; repaint();break;
          case 2:
          case 6:
          case 8:
          case 10:
          case 12:
              response = String maanden + maand = " heeft 30 dagen."; repaint();break;
      }


        }
    }

}


