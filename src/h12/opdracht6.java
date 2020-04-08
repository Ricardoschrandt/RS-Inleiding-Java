package h12;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht6 extends Applet {


    Button knopOK;
    TextField tekstvak;
    int waarde[] = {10,10,10,10,10,10,10,10,10,10};
    int Totaal;




    public void init() {
        knopOK =new Button("OK");
        add (knopOK);
        knopOK.addActionListener(new knopOKlistener());

        tekstvak = new TextField(25);
        knopOK.addActionListener(new knopOKlistener());
        add (tekstvak);
    }

    public void paint(Graphics g)  {
        int teller = 0;

        while(teller < 100){
            if (waarde[teller] == Totaal) {



                g.drawString(String.valueOf(Totaal), 70, 50);




            }
            teller++;


        }

    }

    class knopOKlistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            Totaal = Integer.parseInt(tekstvak.getText());
            repaint();

        }
    }
}
s