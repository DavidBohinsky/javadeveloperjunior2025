package sk.tmconsulting.oop;

public class Kniha {

    String nazov;
    int rokVydania;
    String autor;
    int pocetStran;
    String vydavatelstvo;

    public Kniha(String nazov, int rokVydania, String autor, int pocetStran, String vydavatelstvo) {
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.autor = autor;
        this.pocetStran = pocetStran;
        this.vydavatelstvo = vydavatelstvo;
    }

    public Kniha() {
        this.nazov = "Ja, robot";
        this.autor = "Isaac Asimov";
        this.rokVydania = 1968;
        this.pocetStran = 289;
        this.vydavatelstvo = "Asimov Inc.";
    }
}
