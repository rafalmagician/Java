package GUI;

import javax.swing.*;
import java.awt.*;

public class DwaObrazki extends JFrame {

    private ImageIcon img1;
    private ImageIcon img2;
    private JLabel lLab1;
    private JLabel lLab2;

    DwaObrazki() {

        setLayout(new FlowLayout());

        img1 = new ImageIcon("logo.png");

        lLab1 = new JLabel(img1);
        add(lLab1);

        img2 = new ImageIcon("scoreboard.png");

        lLab2 = new JLabel(img2);
        add(lLab2);

    }

}
