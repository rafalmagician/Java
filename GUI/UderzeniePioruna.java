package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UderzeniePioruna extends JFrame implements ActionListener {

    private JLabel predkoscDzwiekuWPowietrzu;
    private JLabel predkoscDzwiekuWPowietrzuStala;
    private JLabel czasMiedzyBlyskawicaADzwiekiemGrzmotu;
    private JTextField jtCczasMiedzyBlyskawicaADzwiekiemGrzmotu;
    private JButton oblicz;
    private double uderzeniePioruna;
    private JLabel jWynik;
    private JLabel wynikUderzeniaPioruna;

    public UderzeniePioruna() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
        this.setLayout(null);

        predkoscDzwiekuWPowietrzu = new JLabel("Predkosc dzwieku w powietrzu: ");
        predkoscDzwiekuWPowietrzu.setBounds(10, 10, 200, 50);
        add(predkoscDzwiekuWPowietrzu);

        predkoscDzwiekuWPowietrzuStala = new JLabel("330 m/s");
        predkoscDzwiekuWPowietrzuStala.setBounds(210, 10, 50, 50);
        add(predkoscDzwiekuWPowietrzuStala);

        czasMiedzyBlyskawicaADzwiekiemGrzmotu = new JLabel("Podaj czas miedzy blyskawica a dzwiekiem grzmotu: ");
        czasMiedzyBlyskawicaADzwiekiemGrzmotu.setBounds(10, 30, 320, 50);
        add(czasMiedzyBlyskawicaADzwiekiemGrzmotu);

        jtCczasMiedzyBlyskawicaADzwiekiemGrzmotu = new JTextField();
        jtCczasMiedzyBlyskawicaADzwiekiemGrzmotu.setBounds(320, 45, 50, 20);
        add(jtCczasMiedzyBlyskawicaADzwiekiemGrzmotu);

        oblicz = new JButton("OBLICZ");
        oblicz.setBounds(120, 70, 100, 50);
        add(oblicz);
        oblicz.addActionListener(this);

        wynikUderzeniaPioruna = new JLabel("Wynik uderzenia pioruna: ");
        wynikUderzeniaPioruna.setBounds(10, 130, 150, 50);
        add(wynikUderzeniaPioruna);

        jWynik = new JLabel();
        jWynik.setBounds(160, 130, 50, 50);
        add(jWynik);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double wynik = Double.parseDouble(jtCczasMiedzyBlyskawicaADzwiekiemGrzmotu.getText());
        wynik = wynik * 330;
        jWynik.setText(String.valueOf(wynik));

    }
}
