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
        for(int s = 0; s < 11; s++) {
            g.drawString(s + " x " + tafel + " = " + (s * tafel), 100, s * 40);
        g.drawString("als u een andere tafel druk OK ", 200, 200);
        }

        }






}
