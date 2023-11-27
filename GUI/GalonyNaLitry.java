package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GalonyNaLitry extends JFrame implements ActionListener {

    private JLabel lGalony;
    private JLabel lLitry;
    private JTextField tfGalony;
    private JLabel lWyswietlLitry;
    private JButton bZamien;
    private double galony;

    public GalonyNaLitry() {

        setSize(290, 250);
        setTitle("Zamiana galonów na litry");
        setLayout(null);

        lGalony = new JLabel("Galony: ");
        lGalony.setBounds(40, 20, 100, 20);
        add(lGalony);
        tfGalony = new JTextField();
        tfGalony.setBounds(120, 20, 100, 20);
        add(tfGalony);

        bZamien = new JButton("GALONY > LITRY");
        bZamien.setBounds(50, 60, 160, 30);
        add(bZamien);
        bZamien.addActionListener(this);

        lLitry = new JLabel("Litry: ");
        lLitry.setBounds(40, 110, 100, 20);
        add(lLitry);
        lWyswietlLitry = new JLabel();
        lWyswietlLitry.setBounds(120, 110, 100, 20);
        add(lWyswietlLitry);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        galony = Double.parseDouble(tfGalony.getText());
        double litry = galony * 3.7854;
        lWyswietlLitry.setText(String.valueOf(litry));

    }
}
