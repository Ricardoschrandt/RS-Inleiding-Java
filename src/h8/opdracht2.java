package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    String manaantal;
    String vrouwaantal;
    String meisjeaantal;
    String jongenaantal;
    String totaal;
    Button MAN;
    Button VROUW;
    Button MEISJE;
    Button JONGEN;

public void init(){

    MAN =new Button("MAN");
    MAN.addActionListener(new opdracht2.MANlistener());
    add (MAN);



    VROUW =new Button("VROUW");
    add (VROUW);


    MEISJE =new Button("MEISJE");
    add (MEISJE);


   JONGEN =new Button("JONGEN");
    add (JONGEN);


}

    public void paint (Graphics g) {
        g.drawString("aantal mannen" + MAN, 155, 45);
        g.drawString("aantal vrouwen" + VROUW, 185, 45);
        g.drawString("aantal meisjes" + meisjeaantal, 215, 45);
        g.drawString("aantal jongens" + jongenaantal, 245, 45);
        g.drawString("Aantal Personen" + totaal, 100, 90);


    }

    class MAN implements ActionListener {
    MAN = ++
    totaal = ++
    repaint();

    }
}
