package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Okienko extends JFrame implements ActionListener {

    private JButton bPodajDate = new JButton("podaj date");
    private JButton bWyjscie = new JButton("wyjscie");
    private JLabel lWyswietlDate = new JLabel("Data: ");

    public Okienko() {
        setSize(300, 300);
        setTitle("Moje pierwsze okienko");
        setLayout(null);

        bPodajDate.setBounds(50, 50, 100, 50);
        add(bPodajDate);
        bPodajDate.addActionListener(this);

        bWyjscie.setBounds(150, 50, 100, 50);
        add(bWyjscie);
        bWyjscie.addActionListener(this);

        lWyswietlDate.setBounds(50, 150, 200, 50);
        add(lWyswietlDate);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object zrodlo = e.getSource();
        if (zrodlo.equals(bPodajDate)) {
            lWyswietlDate.setText(new Date().toString());
        } else if (zrodlo.equals(bWyjscie)){
            dispose();
        }

    }
}
