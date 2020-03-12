package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2 extends Applet {

    int ManAantal;
    int VrouwAantal;
    int JongensAantal;
    int MeisjeAantal;
    int Totale;

    Button Man;
    Button Vrouw;
    Button Jongen;
    Button Meisje;


    public void init() {

        KnopListener kl = new KnopListener();

        Man = new Button("Man");
        Man.addActionListener(kl);
        ManAantal = 0;
        add(Man);

        Vrouw= new Button("Vrouw");
        Vrouw.addActionListener(new Vrouw());
        VrouwAantal =0;
        add(Vrouw);

        Jongen = new Button("Jongen");
        Jongen.addActionListener(new Jongen());
        JongensAantal = 0;
        add(Jongen);

        Meisje = new Button("Meisje");
        Meisje.addActionListener(new Meisje());
        MeisjeAantal = 0;
        add(Meisje);
    }

    public void paint(Graphics g) {
        g.drawString("Mannen Aantal  " + ManAantal, 50, 80);
        g.drawString("Vrouwen Aantal  " + VrouwAantal, 50, 100);
        g.drawString("Jongens Aantal  " + JongensAantal, 50, 120);
        g.drawString("Meiden Aantal " + MeisjeAantal, 50, 140);
        g.drawString("Totaal aantal personen  " + Totale , 50, 180);
        Totale= ManAantal + VrouwAantal + VrouwAantal + MeisjeAantal;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ManAantal++;
            Totale++;
            repaint();
        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VrouwAantal++;
            Totale++;
            repaint();
        }
    }

    class Jongen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JongensAantal++;
            Totale++;
            repaint();
        }
    }

    class Man implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JongensAantal++;
            Totale++;
            repaint();
        }
    }

    class Meisje implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            MeisjeAantal++;
            Totale++;
            repaint();
        }
    }
}