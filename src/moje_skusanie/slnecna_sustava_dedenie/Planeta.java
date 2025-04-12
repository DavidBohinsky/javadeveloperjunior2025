package moje_skusanie.slnecna_sustava_dedenie;

public interface Planeta {

    //TODO Vytvorte rozhranie týkajúce sa planét našej slnečnej sústavy. Bude obsahovať interface s názvom Planeta
    // s príslušnými metódami (bez implementácie) a následne triedy ako sú Merkur, Venuša, Zem, atď., ktoré implementujú
    // metódy z Planeta. Implementácia metód môže byť úplne jednoduchá a to taká, že len vypíšeme text do konzoly, napr.
    // Áno je na nej život. Áno má obiehajúce mesiace alebo mesiac, resp. nemá …

    default String NazovPlanety(String nazovPlanety) {
        return nazovPlanety;
    }

    default void Voda() {
        System.out.println("Na tejto planéte je voda.");

    }
    default void Zvierata() {
        System.out.println("Na tejto planéte žijú zvieratá.");
    }

    default boolean Prezitie() {
        System.out.println("Na tejto planéte sa dá prežiť");
        return true;
    }

    default int Mesiace(Integer pocet_mesiacov) {
        //System.out.println("Táto planéta má " + pocet_mesiacov + "mesiace");
        return pocet_mesiacov;
    }
}