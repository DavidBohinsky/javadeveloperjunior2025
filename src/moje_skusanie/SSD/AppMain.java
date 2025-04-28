package moje_skusanie.SSD;

import javax.swing.*;
import java.awt.*;

public class AppMain {

    public static void main(String[] args) {
        // Nastavenie vzhľadu
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }

        // Vytvorenie hlavného okna
        JFrame frame = new JFrame("Distribučná Sústava - Technický Asistent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null); // vycentrovanie na obrazovke
        frame.setLayout(new GridLayout());


        // Hlavný panel rozdelený na sekcie - GRID
        JPanel lavy_panel = new JPanel(new GridLayout(2, 2, 10, 10)); //  rady,  stĺpce, medzery
        frame.add(lavy_panel);
        JPanel pravy_panel = new JPanel(new GridLayout(2, 2, 10, 10)); //  rady,  stĺpce, medzery
        frame.add(pravy_panel);

        // Tlačidlá
        JButton prevody_b = new JButton();
        prevody_b.setText("Prevod A ←→ kW");
        JButton prierezy_b = new JButton();
        prierezy_b.setText("Tabuľka prierezov");
        JButton vykony_TS_b = new JButton();
        vykony_TS_b.setText("Výkony TS");

        lavy_panel.add(prevody_b);
        lavy_panel.add(prierezy_b);
        pravy_panel.add(vykony_TS_b);


        // Action listeners
        prevody_b.addActionListener(e -> {
                JFrame prevod_f = new JFrame("Prevod A ←→ kW");
                prevod_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                prevod_f.setSize(400, 400);
                prevod_f.setLocationRelativeTo(null); // vycentrovanie na obrazovke
                prevod_f.setLayout(new GridLayout());

                JTextField a_na_kw_tf = new JTextField();
                double prevodAKw = Double.parseDouble(a_na_kw_tf.getText());
                a_na_kw_tf.setLayout(new FlowLayout());

                prevod_f.add(a_na_kw_tf);

                prevod_f.setVisible(true);


                    });


        frame.setVisible(true);
    }
}
