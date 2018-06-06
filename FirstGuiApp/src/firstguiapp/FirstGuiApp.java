
package firstguiapp;

import java.awt.*;
class Gui extends Frame
{

    Gui()
    {
        Frame f = new Frame();
        setLayout(null);
        setSize(400, 400);
        setTitle("First GUI Application");
        Button b = new Button("OK");
        b.setBounds(50, 50, 50, 50);
        f.add(b);
        Label l = new Label("Hello World");
        l.setBounds(50, 100,80,80);
        f.add(l);
        TextField t = new TextField();
        t.setBounds(50, 150, 80, 80);
        f.add(t);

    }
}
public class FirstGuiApp {
public static void main(String[] args) {

    Gui g = new Gui();
    g.setVisible(true);
}
    
}
