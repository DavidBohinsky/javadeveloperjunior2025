package com.w3schools.priklady.oop;

import sk.tmconsulting.ulohy.Autor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.SystemColor.text;

public class KniznicaMain {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha(); // Vytvorili sme knihu s testovacimi udajmi
        System.out.println("Názov knihy č.1: " + kniha1.nazov);
        System.out.println("Autor knihy č.1: " + kniha1.autor);

        Kniha kniha2 = new Kniha("Harry Potter", 2000, "Rowlingová", 765, "Nejaké vydavateľstvo"); // Vytvarame knihu č.2, do ktorej vlozime hodnoty prostrednictvom pretazeneho konstruktora
        System.out.println("Názov knihy č.2: " + kniha2.nazov);
        System.out.println("Autor knihy č.2: " + kniha2.autor);

        Kniha kniha3 = new Kniha(); // Vytvorili sme knihu č.3 s testovacimi udajmi
        // Naplnili sme atributy (premenne triedy alebo class fields) konkretnymi hodnotami
        kniha3.nazov = "Starec a more";
        kniha3.autor = "Ernest Hemingway";
        kniha3.vydavatelstvo = "Nejaké vydavateľstvo";
        kniha3.pocetStran = 340;
        kniha3.rokVydania = 1958;

        System.out.println("Názov knihy č.3: " + kniha3.nazov);
        System.out.println("Autor knihy č.3: " + kniha3.autor);

        Autor autor = new Autor();
        autor.setMeno("Andrej");
        autor.setPriezvisko("Sladkovič");
        autor.setNarodnost("Slovák");
        autor.setRok_narodenia(1820);
        System.out.println(autor);

        //-------------------------------------------------


        System.out.println("\n");

        Autor autor4 = new Autor("Janko", "Moravec", 1850, "Nie slovenská");
        System.out.println("Autor4 : " + autor4);

        System.out.println("\n");

        Kniha kniha4 = new Kniha ("Starec a more", 1945, "", 765, "Nejaké vydavateľstvo");
        kniha4.setAutor(String.valueOf(autor4));               // IDE mi pomohlo zobrazit/nastaviť konkr. metodu valueOf
        //Kniha kniha2 = new Kniha("Harry Potter", 2000, "Rowlingová", 765, "Nejaké vydavateľstvo");

        System.out.println(kniha4);

        // ------------------------------------------------------------

        JFrame frame = new JFrame("Knižnica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());


        JLabel knihaLabel = new JLabel("Názov: " +kniha1.getNazov() + ", Vydavateľstvo: " + kniha4.getVydavatelstvo() + ", Strany: " + kniha4.getPocetStran());
        knihaLabel.setHorizontalAlignment(SwingConstants.CENTER);


        JButton detailButton = new JButton("Detail autora");
        detailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, kniha1.getAutor().toString(), "Autor knihy", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setLocationRelativeTo(null); //
        frame.setVisible(true);

        frame.add(knihaLabel, BorderLayout.CENTER);
        frame.add(detailButton, BorderLayout.SOUTH);

    }
}
