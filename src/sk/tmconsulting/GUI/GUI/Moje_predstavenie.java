package sk.tmconsulting.GUI.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

public class Moje_predstavenie {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Niečo o mne! "); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna

        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny

        frame.setContentPane(panel); // my dany panel pridame do frame


        // JText
        //JTextField textField = new JTextField();
        //textField.setBounds(95, 20, 200, 30); // x, y, sirka, vyska
       // textField.setHorizontalAlignment(JTextField.RIGHT);
        //panel.add(textField);


        JLabel meno_label = new JLabel("Meno: Dávid Bohinský"); // Meno
        meno_label.setBounds(20,20,150,20); // x, y, sirka, vyska
        panel.add(meno_label);

        JLabel adresa_label = new JLabel("Adresa: Žilina"); // Adresa
        adresa_label.setBounds(20,40,150,20); // x, y, sirka, vyska
        panel.add(adresa_label);

        JLabel vek_label = new JLabel("Vek: 31"); // Adresa
        vek_label.setBounds(20,60,150,20); // x, y, sirka, vyska
        panel.add(vek_label);


        JLabel prekvapenie_label = new JLabel(); // Meno
        prekvapenie_label.setBounds(140,180,150,20); // x, y, sirka, vyska
        panel.add(prekvapenie_label);


        JButton btn_prekvapenie = new JButton("Stlač na prekvapenie!"); // tlacidlo
        btn_prekvapenie.setBounds(80, 150, 220, 20); // x, y, sirka, vyska

        btn_prekvapenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prekvapenie_label.setText("Dnes je prvý apríl! ");
            }
        });
        panel.add(btn_prekvapenie);


        JButton btnCancel = new JButton("Zrušenie programu");
        btnCancel.setBounds(100, 100, 180, 20);

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnCancel);


        ImageIcon icon = new ImageIcon("C:\\Users\\14127\\IdeaProjects\\JavaProject\\src\\sk\\tmconsulting\\GUI\\GUI\\man_character.jpg"); // Cesta k obrázku
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 400, 800); // Umiestnenie obrázka
        //label.setHorizontalAlignment(JLabel.CENTER);




        frame.add(label);
        frame.pack();
        frame.setVisible(true);

    }
}

