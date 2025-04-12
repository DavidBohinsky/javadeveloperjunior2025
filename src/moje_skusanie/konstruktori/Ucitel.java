package moje_skusanie.konstruktori;

public class Ucitel {

    int vek;
    String meno, priezvisko;

    public Ucitel() {
        this.vek = 5;
        this.meno = "Bez mena";
        this.priezvisko = "Bez priezviska";

    }


    // predvolena inicializacia objektu - tzn. ake vsetky vlastnosti ma ucitel
    public Ucitel(int vek, String meno, String priezvisko) {
        this.vek = vek;
        this.meno = meno;
        this.priezvisko = priezvisko;
    }


}
