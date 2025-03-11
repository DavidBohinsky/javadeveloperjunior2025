public class JednoduchaKalkulkackaMain {

    public static void scitanie(int a, int b) {
        int scitanie = a + b;
        System.out.println("Výsledok sčítania " + a + " a " + b + " volaním metódy scitanie je " + scitanie);


    }

    public static double scitanieVratiVysledok(double cislo1, double cislo2) {
        return cislo1 + cislo2;
    }

    public static void main(String[] args) {
        var a = 5;
        var b = 10;
        var scitanie = a + b;

        System.out.printf("Výsledok sčítania %d a %d je %d", a, b, a + b);

        System.out.println("Výsledok sčítania " + a + " a " + b + " je " + (a + b));

        scitanie(a, b);
    }

}