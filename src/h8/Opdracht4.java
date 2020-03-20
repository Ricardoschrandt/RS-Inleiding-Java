package h8;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet{

    Button plus, min, keer, deel;
    TextField tekstvak1,tekstvak2, tekstvak3;


    public void init() {

        tekstvak1 = new TextField(20);
        add(tekstvak1);
        tekstvak2 = new TextField(20);
        add(tekstvak2);
        tekstvak3 = new TextField(20);
        add(tekstvak3);

        plus = new Button("+");
        plus.addActionListener(new plusListener());
        add(plus);

        min = new Button("-");
        plus.addActionListener(new minListener());
        add(min);

        keer = new Button ("*");
        keer.addActionListener(new keerListener());
        add(keer);

        deel = new Button("/");
        deel.addActionListener(new deelListener());
        add(deel);
    }


    public void paint(Graphics g) { }

    class plusListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getal2 = Double.parseDouble(B);
            double uitkomst = getal1 + getal2;
            tekstvak3.setText(String.valueOf(uitkomst));
            tekstvak2.getText();

        }
    }

    class deelListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getal2 = Double.parseDouble(B);
            double uitkomst = getal1 / getal2;
            tekstvak3.setText(String.valueOf(uitkomst));
            tekstvak2.getText();

        }
    }

    class minListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getal2 = Double.parseDouble(B);
            double uitkomst = getal1 - getal2;
            tekstvak3.setText(String.valueOf(uitkomst));
            tekstvak2.getText();
        }
    }

    class keerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getal2 = Double.parseDouble(B);
            double uitkomst = getal1 * getal2;
            tekstvak3.setText(String.valueOf(uitkomst));
            tekstvak2.getText();
        }
    }



}