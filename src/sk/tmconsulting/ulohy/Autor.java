package sk.tmconsulting.ulohy;

public class Autor {

/*
TODO 1.) Chalani mi sme rozprávali o enkapsulácii, kde sme si hovorili, že atribúty (premenné, fields) triedy sú skryté a zvonku viditeľné len prostredníctvom getterov a setterov. Vytvárali sme si triedu Kniha, kde sme zadali napr. názov knihy, počet strán, autora a pod. A teraz dôležité: Autor však môže mať meno, priezvisko, dátum narodenia a pod. Na to by sme nemali spraviť jednotlivé premenné, ale zvlášť triedu Autor a dané premenné spolu s gettermi a settermi vytvoriť tam. A teraz úloha: Akým spôsobom prepojiť, resp. do knihy vložiť (triedu) autora? Vytvor praktický príklad ...

TODO 2.) Naposledy sme robili appku vo Swingu. Vedeli by ste vytvoriť tlačidlo a vložiť do JFrame, ktoré by po kliknutí zobrazilo údaje? A to také, ktoré by sme mu "odovzdali" z hlavného okna?

TODO 3.) Smerujem k tomu, že v appke by mohli byť informácie ohľadom knihy spolu s menom autora a po kliknutí na tlačidlo Detail by sa zobrali bližšie informácie o autorovi (napr. dátum narodenia, miesto narodenia, pohlavie a pod.).
*/

    String meno;
    String priezvisko;
    Integer rok_narodenia;
    String narodnost;

    public Autor(String meno, String priezvisko, Integer rok_narodenia, String narodnost) {       // konštruktor
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rok_narodenia = rok_narodenia;
        this.narodnost = narodnost;
    }

    public Autor() {                              // konštruktor
        meno = "Neznáme";
        priezvisko = "Neznáme";
        rok_narodenia = 0;
        narodnost = "Neznáma";
    }

    public String getNarodnost() {
        return narodnost;
    }

    public void setNarodnost(String narodnost) {
        this.narodnost = narodnost;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public Integer getRok_narodenia() {
        return rok_narodenia;
    }

    public void setRok_narodenia(int rok_narodenia) {
        if (rok_narodenia >= 0) {
            this.rok_narodenia = rok_narodenia;
        } else {
            System.out.println("Vek nemôže byť záporný!");
        }
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    @Override
    public String toString() {                              // cele to jednoducho vypiše keď sa vola "autor"
        return "Autor: " +
                "meno= " + meno  +
                ", priezvisko= " + priezvisko +
                ", rok_narodenia= " + rok_narodenia +
                ", narodnost= " + narodnost;
    }

    /*    public static void main(String[] args) {

    }*/
}
