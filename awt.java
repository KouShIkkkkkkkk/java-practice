import java.awt.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class awt extends Frame {
    awt() {
        JFrame f = new JFrame("checkbox example");
        JCheckBox c = new JCheckBox("java");
        c.setBounds(100, 100, 50, 50);
        JCheckBox c1 = new JCheckBox("c++", true);
        c1.setBounds(100, 150, 50, 50);
        f.add(c);
        f.add(c1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new awt();
    }

}
