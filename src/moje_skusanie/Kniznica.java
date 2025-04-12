package moje_skusanie;

import java.util.ArrayList;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {

        /*Úloha č. 2:
        Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autor, rok vydania) cez konzolu kým
        nezadá slovo koniec. Tie na konci vypíšeme. Opakovanie na ArrayList.
                Menu s možnosťami: ......*/

        ArrayList<String> knihy = new ArrayList<>();
        String kniha = "";
        String volba = "";
        Integer index = 1;
        String kniha_pod_naz = "";

        Scanner scn = new Scanner(System.in);

        do  {
        System.out.println("Vyber si z menu" +
                "        1.\tZadaj novú knihu\n" +
                "        2.\tZobraz všetky knihy\n" +
                "        3.\tZobraz konkrétnu knihu (podľa indexu)\n" +
                "        4.\tVymaž konkrétnu knihu (podľa indexu)\n" +
                "        5.\tZobraz počet všetkých kníh\n" +
                "        6.\tVyhľadaj knihu podľa názvu\n" +
                "        7.\tNačítaj zoznam kníh zo súboru (zadaj názov súboru)\n" +
                "        8.\tUlož zoznam kníh do súboru (zadaj názov súboru)\n" +
                "        9.\tUprav knihu\n" +
                "        10.\tVymaž všetky knihy\n" +
                "        11.\tExport do PDF \n" +
                "        12.\tUkonči program\n" +
                "---------------------------------------------------------------------\n"+
                "  Tvoj vyber: \n ");


        volba = scn.nextLine();
        index = 1;

            if (volba.equals("1")) {                                     // Zadaj nazov knihy
                System.out.println("Zadaj názov knihy: ");
                kniha = scn.nextLine();
                knihy.add(kniha);

            }

            else if (volba.equals("2")) {                                // zobraz vsetky knihy
                for (String knizka : knihy) {
                    System.out.println(index + ". " + knizka);
                    index++;
                }
            }
            else if (volba.equals("4")) {                                 // kniha na vymaz
                System.out.println("Zadaj index knihy na vymazanie: ");
                String i = scn.nextLine();
                if (i.equals(index)) {
                    knihy.remove(kniha);
                }

                }

            else if (volba.equals("5")) {                                  // pocet knih
                System.out.println("Počet knih: " + knihy.size());

            }

            else if (volba.equals("6")) {                                   // vyhladavanie knihy
                System.out.println("Vyhľadaj knihu podľa názvu: ");
                kniha_pod_naz = scn.nextLine();
                for (String knizka : knihy) {
                    if (kniha_pod_naz.equalsIgnoreCase(knizka)) {
                        System.out.println("Kniha nájdená: " + knizka);
                    }
                        else {
                            System.out.println("Kniha nenájdená ");
                        }
                    }
                }

            else if (volba.equals("12")) {
                System.out.println("Program ukončený");

            }
            else {
                System.out.println("Neplatná voľba! ");

            }
        }
        while (!volba.equals("12"));

        scn.close();

    }
}
