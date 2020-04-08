package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class opdracht3 extends Applet {

    TextField tekstvakken[];
    Button knop;
    int getallen[];




    public void init() {

        tekstvakken = new TextField[6];
        getallen = new int[6];
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(knop);

        for (int i = 0; i < tekstvakken.length; i++){
            tekstvakken[i] = new TextField("", 10);
            add(tekstvakken[i]);
        }


    }

    public void paint(Graphics g) {

    }
    public class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < tekstvakken.length; teller++){
                getallen[teller] = Integer.parseInt(tekstvakken[teller].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < tekstvakken.length; i++){
                tekstvakken[i].setText("" + (getallen[i]));
            }
        }
    }





}