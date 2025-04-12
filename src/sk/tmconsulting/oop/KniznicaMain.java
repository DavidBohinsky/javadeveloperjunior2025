package sk.tmconsulting.oop;

public class KniznicaMain {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha();
        System.out.println("Názov knihy č.1: " + kniha1.nazov);
        System.out.println("Autor knihy č.1: " + kniha1.autor);

        Kniha kniha2 = new Kniha("Harry Potter", 2000, "Rowlingová", 765, "Nejaké vydavateľstvo"); // Vytvarame knihu č.2
        System.out.println("Názov knihy č.2: " + kniha2.nazov);
        System.out.println("Autor knihy č.2: " + kniha2.autor);
    }
}