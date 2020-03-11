package h8;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    TextField tekstvak;
    Label label;
    Button Knopster;
    Button Knopslash;
    Button knopplus;
    Button knopmin;

public void init(){

    tekstvak =new TextField(15 );
    label = new Label("type een aantal");
    add (label);
    add (tekstvak);

    knopplus =new Button("+");
    add (knopplus);

    knopmin =new Button("-");
    add (knopmin);

    Knopslash =new Button("/");
    add (Knopslash);

   Knopster =new Button("*");
    add (Knopster);


}

    public void paint(Graphics g) {
        g.drawString("", 50, 60 );
    }

}
