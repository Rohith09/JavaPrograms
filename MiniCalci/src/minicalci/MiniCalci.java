
package minicalci;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Gui extends Frame
        
{
    
    Button b1,b2,b3,b4;
    TextField t1,t2;
    Label l1,l2,l3,l4;
    Panel p;
    class A implements ActionListener     //we are going to handle event of each button through different class.
    
            //The concept of nested classes is used here so that these classes cannot be used by any other class.
            
           
    {
    @Override
        public void actionPerformed(ActionEvent e) {
            
            try{
            String s1 = t1.getText();    //To receive the text from the Text Field
            String s2 = t2.getText();     //To receive the text from the Text Field
            int n1 = Integer.parseInt(s1); //To convert string into an integer.
            int n2 = Integer.parseInt(s2);
            int n = n1+n2;         //Adding the values
            l4.setText(String.valueOf(n));      //To print the sum on to the label
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
            
           
            
            
        }
                
            }
    
    class B implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            String s1 = t1.getText();    //To receive the text from the Text Field
            String s2 = t2.getText();     //To receive the text from the Text Field
            int n1 = Integer.parseInt(s1); //To convert string into an integer.
            int n2 = Integer.parseInt(s2);
            int n = n1-n2;         //Subtracting  the values
            l4.setText(String.valueOf(n));      //To print the sum on to the label
                
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
            
            
        }
    }
    class C implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            String s1 = t1.getText();    //To receive the text from the Text Field
            String s2 = t2.getText();     //To receive the text from the Text Field
            int n1 = Integer.parseInt(s1); //To convert string into an integer.
            int n2 = Integer.parseInt(s2);
            int n = n1*n2;         //Multiplying  the values
            l4.setText(String.valueOf(n));      //To print the sum on to the label
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
            
            
            
        }
    }
    class D implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            String s1 = t1.getText();    //To receive the text from the Text Field
            String s2 = t2.getText();     //To receive the text from the Text Field
            int n1 = Integer.parseInt(s1); //To convert string into an integer.
            int n2 = Integer.parseInt(s2);
            int n = n1/n2;         //Dividing  the values
            l4.setText(String.valueOf(n));      //To print the sum on to the label
                
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
            
            
            
        }
    }
    Gui()
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setBackground(Color.yellow);
        f.setTitle("Mini Calculator");
        p = new Panel();
        p.setLayout(null);
        p.setBounds(50, 70, 300, 170);
        p.setBackground(Color.BLUE);
        f.add(p);
        l1 = new Label("1st No:");
        l1.setBounds(20,20,60,20);
        l1.setForeground(Color.WHITE);
        p.add(l1);
        t1 = new TextField("0");
        t1.setForeground(Color.RED);
        t1.setBounds(100,20 ,180 ,20 );
        p.add(t1);
        l2 = new Label("2nd No:");
        l2.setForeground(Color.WHITE);
        l2.setBounds(20,60,60,20);
        p.add(l2);
        t2 = new TextField("0");
        t2.setForeground(Color.red);
        t2.setBounds(100, 60, 180, 20);
        p.add(t2);
        b1 = new Button("+");
        b1.addActionListener(new A());
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.red);
        b1.setBounds(20, 100, 40, 30);
        p.add(b1);
        b2 = new Button("-");
        b2.addActionListener(new B());
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.red);
        b2.setBounds(80, 100, 40, 30);
        p.add(b2);
        b3 = new Button("*");
        b3.addActionListener(new C());
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.red);
        b3.setBounds(140, 100, 40, 30);
        p.add(b3);
        b4 = new Button("/");
        b4.addActionListener(new D());
        b4.setBackground(Color.YELLOW);
        b4.setForeground(Color.red);
        b4.setBounds(200, 100, 40, 30);
        p.add(b4);
        l3 = new Label("Answer:");
        l3.setBounds(50,260,60,20);
        f.add(l3);
        l4 = new Label("---------");
        l4.setBounds(130,260,220,20);
        f.add(l4);
        
        
    }
    
}
public class MiniCalci {
public static void main(String[] args) {
    Gui g = new Gui();
   

    
}
    
}
