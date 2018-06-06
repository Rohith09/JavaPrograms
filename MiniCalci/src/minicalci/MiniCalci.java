
package minicalci;

import java.awt.*;

class Gui extends Frame
{
    Gui()
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setBackground(Color.yellow);
        f.setTitle("Mini Calculator");
        Panel p = new Panel();
        p.setLayout(null);
        p.setBounds(50, 70, 300, 170);
        p.setBackground(Color.BLUE);
        f.add(p);
        Label l1 = new Label("1st No:");
        l1.setBounds(20,20,60,20);
        l1.setForeground(Color.WHITE);
        p.add(l1);
        TextField t1 = new TextField("0");
        t1.setForeground(Color.RED);
        t1.setBounds(100,20 ,180 ,20 );
        p.add(t1);
        Label l2 = new Label("2nd No:");
        l2.setForeground(Color.WHITE);
        l2.setBounds(20,60,60,20);
        p.add(l2);
        TextField t2 = new TextField("0");
        t2.setForeground(Color.red);
        t2.setBounds(100, 60, 180, 20);
        p.add(t2);
        Button b1 = new Button("+");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.red);
        b1.setBounds(20, 100, 40, 30);
        p.add(b1);
        Button b2 = new Button("-");
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.red);
        b2.setBounds(80, 100, 40, 30);
        p.add(b2);
        Button b3 = new Button("*");
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.red);
        b3.setBounds(140, 100, 40, 30);
        p.add(b3);
        Button b4 = new Button("/");
        b4.setBackground(Color.YELLOW);
        b4.setForeground(Color.red);
        b4.setBounds(200, 100, 40, 30);
        p.add(b4);
        Label l3 = new Label("Answer:");
        l3.setBounds(50,260,60,20);
        f.add(l3);
        Label l4 = new Label("---------");
        l4.setBounds(130,260,100,20);
        f.add(l4);
        
        
    }
    
}
public class MiniCalci {
public static void main(String[] args) {
    Gui g = new Gui();
   

    
}
    
}
