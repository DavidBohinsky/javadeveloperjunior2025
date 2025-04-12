package moje_skusanie.slnecna_sustava_dedenie;

public class Main {
    public static void main(String[] args) { // Opravená statická metóda main
        Zemegula zem = new Zemegula();
        //zem.NazovPlanety("Zem");
        //zem.Mesiace(1);

        System.out.println("Na planéte Zem je prežitie: " + zem.Prezitie());
        //zem.Zobrazenieplanety();
        zem.Voda();
        zem.Zvierata();
        System.out.println("Zem má počet mesiacov " + zem.Mesiace(1));
        System.out.println("Názov tejto planéty je " + zem.NazovPlanety("Zem"));
        System.out.println(zem);           // co robi ten to_string?
    }
}

