package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet{

    TextField tekstvak;
    Double Nummers;


    public void init(){

        tekstvak = new TextField (25);
        tekstvak.addActionListener(new CalcuListener());
        add(tekstvak);
    }
     public void paint(Graphics g){

        g.drawString(" de prijs inclusief BTW " + Nummers, 25, 50) ;

     }

     class CalcuListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String tekst = tekstvak.getText();
            Double userInput = Double.parseDouble(tekst) ;
            Nummers = userInput * 1.21;
            repaint();


        }
     }




}
