package sk.tmconsulting.testy;


public class Circle {

    public double obsahKruhu(double polomer) {

        double obsah = Math.PI * polomer * polomer; // Vzorec pro obsah kruhu
        return obsah;

    }

    public double obvodKruhu(double polomer) {
        double obvod = 2 * Math.PI * polomer;
        return obvod;

    }

    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println(circle.obsahKruhu(4));
        System.out.println(circle.obvodKruhu(5));


    }

}
