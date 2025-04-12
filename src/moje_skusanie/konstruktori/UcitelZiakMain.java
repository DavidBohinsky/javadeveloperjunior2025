package moje_skusanie.konstruktori;

public class UcitelZiakMain {
    public static void main(String[] args) {
        System.out.println("Toto je zatial skuška programu.");

        Ucitel ucitel = new Ucitel(5, "Jožko",  "Haluška");
        Ucitel ucitel2 = new Ucitel();
        System.out.println("Meno prveho Ucitela je: " + ucitel.meno);
        System.out.println("Meno druheho Ucitela: " + ucitel2.meno);

    }
}
