package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class opdracht1 extends Applet {

// commands
 TextField tekstvak;
 Button knopOK;
 Button knopReset;
 String message;

 public void init () {

    tekstvak =new TextField(25 );
    add (tekstvak);

    knopOK =new Button("OK");
    add (knopOK);
     knopOK.addActionListener(new knopOKlistener());

    knopReset =new Button("Reset");
    knopReset.addActionListener(new knopResetlistener());
    add (knopReset);

    message = "type iets";

}

 public void paint (Graphics g) {
     g.drawString(message, 25, 80);
     g.drawString(message, 25, 80);


}

     class knopResetlistener implements ActionListener {

         @Override
         public void actionPerformed(ActionEvent e) {
           String userInput = tekstvak.getText();
           tekstvak.setText("");
         }
     }

     class knopOKlistener implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
             message = tekstvak.getText();
             repaint();

         }
     }

}