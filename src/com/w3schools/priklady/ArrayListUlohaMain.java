package com.w3schools.priklady;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUlohaMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> cisla = new ArrayList<>();

        //System.out.println("Zadaj čísla. Po zadaní záporného čísla sa program ukončí. : ");
        while (true) {
            try {
                System.out.print("Zadaj číslo: ");
                double cislo = scanner.nextDouble();
                if (cislo < 0) {
                    break;
                }
                cisla.add(cislo);
            } catch (NumberFormatException e) {
                System.out.println("Neplatný vstup! Zadaj prosím kladné číslo.");
                scanner.next(); // Vyčitenie pamäte.
            }
        }

        System.out.println("Zoznam čísel: " + cisla);
        System.out.println("Sucet cisiel: " + Scitanie(cisla));


        scanner.close();
    }

    public static double Scitanie(ArrayList<Double> cisla){
        double sucet = 0;

        for (double cislo : cisla) {
            sucet = sucet + cislo;
        }
        double zaokruhlenySucet = Math.round(sucet * 100.0) / 100.0;
        return zaokruhlenySucet;
        //double roundedValue = Math.round(value * 100.0) / 100.0;

    }
}








