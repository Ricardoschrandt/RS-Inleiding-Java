package h11;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk extends Applet {

    int tafel;
    int message;
    TextField tekstvak;
    Button OK;
    String s;

    public void init() {

        tafel = 1;

        tekstvak = new TextField(25);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        OK = new Button("OK");
        OK.addActionListener(new OKListener());
        add(OK);

    }

    public class OKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            tafel++;
            tekstvak.setText(Integer.toString(tafel));
            repaint();
        }


    }

    public class tekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tafel = Integer.parseInt(s);
        }
    }

    public void paint(Graphics g) {
        for(int s = 1; s < 11; s ++) {
            g.drawString(tafel + " x " + tafel + " = " + (s * tafel), 100, s * 40);

        }

        }






}
