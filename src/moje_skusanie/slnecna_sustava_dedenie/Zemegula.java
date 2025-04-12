package moje_skusanie.slnecna_sustava_dedenie;



public class Zemegula implements Planeta {
    @Override
    public void Voda() {
        System.out.println("Na tejto planéte je veľa vody.");
    }

    @Override
    public void Zvierata() {
        System.out.println("Na tejto planéte su zvierata.");
    }

    @Override
    public boolean Prezitie() {
        System.out.println("Na tejto planéte sa da prezit");
        return true;
    }

    /*public void Zobrazenieplanety() {
        System.out.println("Táto planéta sa volá Zem.");
    }*/

    @Override
    public String toString() {
        return "Zemegula{}";
    }

    @Override
    public int Mesiace(Integer pocet_mesiacov) {
        return Planeta.super.Mesiace(pocet_mesiacov);
    }

    @Override
    public String NazovPlanety(String nazovPlanety) {
        return Planeta.super.NazovPlanety(nazovPlanety);
    }
}

