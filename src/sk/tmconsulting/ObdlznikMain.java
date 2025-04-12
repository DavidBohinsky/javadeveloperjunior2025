package sk.tmconsulting;

import java.util.Scanner;

public class ObdlznikMain {

    public static double obsahObdlznika(double cislo1, double cislo2) {
        double obsahObdlznika = cislo1 * cislo2;
        return obsahObdlznika;
        //System.out.println("Výsledok obsahu obdlznika je " + obsahObdlznika);
    }

    public static double obvodObdlznika(double cislo1, double cislo2) {
        double obvodObdlznika = 2 * (cislo1 + cislo2);
        return obvodObdlznika;
        //System.out.println("Výsledok obvodu obdlznika je " + obvodObdlznika);
    }

    public static void main(String[] args) {
        //TODO Vytvor program, ktorý vypočíta obsah a obvod obdĺžnika. Program bude fungovať tak, že používateľ zadá dĺžku a šírku prostredníctvom používateľského vstupu (konzoly) a výstupom bude výpočet obsahu a obvodu obdĺžnika.

        Scanner scn = new Scanner(System.in); // Inicializacia pouzivatelskeho vstupu, tzv. Scanneru

        System.out.print("Zadaj stranu a: ");
        double a = scn.nextDouble();

        System.out.print("Zadaj stranu b: ");
        double b = scn.nextDouble();

        scn.nextLine();                                // toto tu muselo byt, inak to preslo cele
        System.out.println();

        System.out.println("Obsah alebo obvod? ");
        //String over = scn.nextLine();                   // ---------******************* POZOR
        String overenie = scn.nextLine().toUpperCase();

        System.out.println("Prijaté: " + overenie);

        if (overenie.equals("S")) {
            System.out.println(obsahObdlznika(a, b));
        } else if (overenie.equals("O")) {
            System.out.println(obvodObdlznika(a, b));
        } else {
            System.out.println("Nezadal si 'S' alebo 'O' !");
        }

        scn.close();
    }
}


