import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PremenneUlohaMain {
    public static void main(String[] args) {
        String znamka = "1,5";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");   // nastavenie formatovania datumu

        String datumNar = LocalDate.of(2022, 1, 5).format(format);      // do datumNar ukladame local date a formatujeme ho
        String aktualnyDatum = LocalDate.now().format(format);                                  // to iste robime s aktualny datumom

        Date datum = new Date();


        System.out.println("Jozef M. sa narodil " + datumNar + " z maturitnej skusky ma znamku "
                + znamka + " a od septembra 2022 nastupi do noveho zamesnatnia v BA dňa " + aktualnyDatum);

        // TODO zmenit datum an slovensky format


        //System.out.printf("Študent %s sa narodil %s, z maturitnej skúšky má známku %2.f a od %s nastúpi do nového zamestnania ako Java programátor", meno, datum, znamka, obdobie);

    }

}
