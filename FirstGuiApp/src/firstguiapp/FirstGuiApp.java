
package firstguiapp;

import java.awt.*;

public class FirstGuiApp {
public static void main(String[] args) {
    Frame f = new Frame();
    f.setVisible(true);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setTitle("My First Gui Application");
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
