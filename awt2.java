import java.awt.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class awt2 {
    awt2() {
        Frame f = new Frame();

        Label l = new Label("employee id");

        Button b = new Button("submit");

        TextField t = new TextField();

        l.setBounds(20, 80, 80, 30);
        b.setBounds(20, 100, 80, 30);
        t.setBounds(100, 100, 80, 30);
        f.add(l);
        f.add(b);
        f.add(t);

        f.setSize(400, 300);

        f.setTitle("employye info");

        f.setLayout(null);

        f.setVisible(true);

    }

    public static void main(String[] args) {
        awt2 a1 = new awt2();

    }
}
