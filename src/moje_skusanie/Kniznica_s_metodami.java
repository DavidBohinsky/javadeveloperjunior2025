package moje_skusanie;

import java.util.ArrayList;
import java.util.Scanner;

public class Kniznica_s_metodami {

    ArrayList<String> knihy = new ArrayList<>();
    String kniha = "";
    String volba = "";
    Integer index = 1;
    Integer n = 0;
    String kniha_pod_naz = "";
    Integer k;


    Scanner scn = new Scanner(System.in);


    public String zadaj_Nazov_knihy() {                                 //Zadaj názov knihy
        //Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov knihy: ");
        kniha = scn.nextLine();
        knihy.add(kniha);
        return kniha;
    }

    public void zobrazKnihy() {
        for (String knizka : knihy) {                                  // zobraz vsetky knihy
            System.out.println(index + ". " + knizka);
            index++;
        }
        index = 1;
    }

    public void zobrazKnihupodlaIndexu() {                                  // zobraz knihu podla indexu
        System.out.println("Zadaj index na zobrazenie konkrétnej knihy:");
        index = scn.nextInt();
        //scn.nextLine(); // Očistenie bufferu
        System.out.println(knihy.get(index - 1));                           // Indexovanie v ArrayList začína od 0
    }

    public void vyhladajKnihuPodlanazvu() {

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



    public static void main(String[] args) {

        Kniznica_s_metodami kniznica = new Kniznica_s_metodami();       // vytvaram objekt kniznica

        String volba = "";
        ArrayList<String> knihy = new ArrayList<>();
        String kniha = "";
        Integer index = 1;
        String kniha_pod_naz = "";

        Scanner scn = new Scanner(System.in);


        do {
            System.out.println("Vyber si z menu" +
                    "        1.\tZadaj novú knihu\n" +      // ok
                    "        2.\tZobraz všetky knihy\n" +   // ok
                    "        3.\tZobraz konkrétnu knihu (podľa indexu)\n" +     // ok
                    "        4.\tVymaž konkrétnu knihu (podľa indexu)\n" +      // knihy.get(index - 1)
                    "        5.\tZobraz počet všetkých kníh\n" +                // .size
                    "        6.\tVyhľadaj knihu podľa názvu\n" +
                    "        7.\tNačítaj zoznam kníh zo súboru (zadaj názov súboru)\n" +
                    "        8.\tUlož zoznam kníh do súboru (zadaj názov súboru)\n" +
                    "        9.\tUprav knihu\n" +
                    "        10.\tVymaž všetky knihy\n" +
                    "        11.\tExport do PDF \n" +
                    "        12.\tUkonči program\n" +
                    "---------------------------------------------------------------------\n" +
                    "  Tvoj vyber: \n ");

            volba = scn.nextLine();
            index = 1;

            if (volba.equals("1")) {                                     // Zadaj nazov knihy HOTOVO
                kniznica.zadaj_Nazov_knihy();

            }
            else if (volba.equals("2")) {                                     // Zobraz knihy HOTOVO
                kniznica.zobrazKnihy();

            }

            else if (volba.equals("3")) {                                     // Hladaj nazov podla indexu
                kniznica.zobrazKnihupodlaIndexu();

            }

            else if (volba.equals("6")) {                                     // Hladaj knihu podla nazvu
                kniznica.vyhladajKnihuPodlanazvu();

            }

             else {
                System.out.println("Program ukončený");


            }



        } while (!volba.equals("12"));


    }
}