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


      switch (maand) {
          case 1: response = "Januari heeft 31 dagen"; repaint(); break;
          case 2: response = "Februari heeft 28 dagen"; repaint(); break;
          case 3: response = "Maart heeft 31 dagen"; repaint(); break;
          case 4: response = "April heeft 30 dagen"; repaint(); break;
          case 5: response = "Mei heeft 31 dagen"; repaint(); break;
          case 6: response = "Juni heeft 30 dagen"; repaint(); break;
          case 7: response = "Juli heeft 31 dagen"; repaint(); break;
          case 8: response = "Augustus heeft 30 dagen"; repaint(); break;
          case 9: response = "September heeft 31 dagen"; repaint(); break;
          case 10: response = "Oktober heeft 30 dagen"; repaint(); break;
          case 11: response = "November heeft 31 dagen"; repaint(); break;
          case 12: response = "December heeft 30 dagen"; repaint(); break;
      }


        }
    }

}


