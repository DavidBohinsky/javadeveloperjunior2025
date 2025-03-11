package sk.tmconsulting.ulohy;

import java.util.Scanner;

public class Matrix1Main {
    public static void main(String[] args) {
        int cisla = 30;

        System.out.println("──────────────────────");
        for (int cislo = 1; cislo <= cisla; cislo++) {

            System.out.print(" | " + cislo);

            if (cislo % 5 == 0) {
                System.out.println(" | ");
                System.out.println("───────────────────────────");
            }
        }
    }
}
