package loginform;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class login extends Frame
{
    Frame f;
    Panel p;
    TextField t1,t2;
    Label l1,l2,l3;
    Button b1;
    
    class A implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String s1 = t1.getText();
        String s2 = t2.getText();
       
        if("inc1234".equals(s1)&& "inc12".equals(s2))
        {
            l3.setText("Login Successful");
        }
        else
        {
          l3.setText("Invalid Credentials");

        }
    }
    
}
    login()
    {
        f = new Frame();
        f.setVisible(true);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setTitle("Login Form");
        f.setBackground(Color.BLACK);
        p = new Panel();
        p.setBounds(50, 70, 300, 170 );
        p.setBackground(Color.red);
        f.add(p);
        l1 = new Label("User:");
        l1.setBounds(20,20,50,20);
        l1.setForeground(Color.WHITE);
        p.add(l1);
        t1 = new TextField();
        t1.setForeground(Color.RED);
        t1.setBounds(100,20,180,20 );
        p.add(t1);
        l2 = new Label("Password:");
        l2.setForeground(Color.WHITE);
        l2.setBounds(20,60,70,20);
        p.add(l2);
        t2 = new TextField();
        t2.setForeground(Color.red);
        t2.setBounds(100, 60, 180, 20);
        p.add(t2);
        b1 = new Button("LOGIN");
        b1.addActionListener(new A());
        b1.setBounds(150,80 ,50 ,50 );
        b1.setForeground(Color.red);
        p.add(b1);
        l3 = new Label("-------");
        f.add(l3);
        l3.setBounds( 190,230 ,120 ,100 );
        l3.setForeground(Color.red);

    }
}
public class LoginForm {
    
public static void main(String[] args) {
    login l = new login();

}
    
}
