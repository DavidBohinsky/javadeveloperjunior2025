package com.w3schools.priklady;

import java.util.ArrayList;
import java.util.Scanner;

public class JednoduchaKniznicaMain {

    ArrayList<String> zoznamKnih = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        JednoduchaKniznicaMain jednoduchaKniznicaMain = new JednoduchaKniznicaMain();

        //System.out.println("Zoznam knih: " + zoznamKnih);
        //System.out.println("Zadaj knihu: " + zadajKnihu());

        while (true) {

            System.out.println("Zvol si možnosť z menu: ");
            System.out.println("Zadaj 1-ku pre zadanie knihy");
            System.out.println("Zadaj 2-ku pre zoznam knih");
            System.out.println("\n");

            System.out.println("Zadaj číslo");
            String volba = jednoduchaKniznicaMain.scanner.nextLine();

            if (volba.equals("1")) {
                jednoduchaKniznicaMain.zadajKnihu();
            }
            if (volba.equals("2")) {
                jednoduchaKniznicaMain.vypisZoznamKnih();
            }

            if (volba.equals("6")) {
                break;
            }
            //Int volba = scanner(System.in);

        }
        jednoduchaKniznicaMain.scanner.close();


    }

    public void vypisZoznamKnih() {
        for (String kniha : zoznamKnih) {
            System.out.println("- " + kniha);
        }
    }

    public String zadajKnihu() {
        System.out.print("Zadaj názov knihy: ");
        String nazovKnihy = scanner.nextLine();
        zoznamKnih.add(nazovKnihy);
        return nazovKnihy;
    }
}
