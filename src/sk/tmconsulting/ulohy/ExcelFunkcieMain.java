package sk.tmconsulting.ulohy;

public class ExcelFunkcieMain {

    public static double getSum(double[] desatinneCisla) {
        double suma = 0; // Premenná pre súčet

        for (double cislo : desatinneCisla) {
            suma += cislo;
        }
        return suma;
    }

    public static double min(double[] desatinneCisla) {
        double min = desatinneCisla[0];                // dolezite deklarovat hodnotu min

        for (double cislo : desatinneCisla) {
            if (cislo < min) {
                min = cislo;
            };
        }
        return min;
    }

    public static double max(double[] desatinneCisla) {
        double max = desatinneCisla[0];                // dolezite deklarovat hodnotu min

        for (double cislo : desatinneCisla) {
            if (cislo > max) {
                max = cislo;
            };
        }
        return max;
    }

    public static double priemeruj(double[] desatinneCisla) {

        double suma = getSum(desatinneCisla);               // pouzivame motodu getsum
        double pocetCisel = desatinneCisla.length;

        double priemer = suma / pocetCisel;                  // vzorec na priemer


        return priemer;
    }


    public static void main(String[] args) {

        double[] desatinneCisla = {10.3, 8.9, 5, 4.4};
        //double priemer = priemeruj(desatinneCisla);
        //double sucet = getSum(desatinneCisla);

        System.out.println(priemeruj(desatinneCisla));
        System.out.println(getSum(desatinneCisla));
        System.out.println("Najmensie cislo je: " + min(desatinneCisla));
        System.out.println("Najvacsie cislo je: " + max(desatinneCisla));
    }
}
