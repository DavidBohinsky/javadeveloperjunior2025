package sk.tmconsulting.ulohy;

import java.util.Scanner;

public class FizzBuzzNovyMain {
    public static void main(String[] args) {

        //double cisla[];

        //TODO fizz = 3, buzz = 5, FizzBuzz ked 3 aj 5

        Scanner scr = new Scanner(System.in);
        System.out.print("Zadaj cislo: ");
        int cisla = scr.nextInt();

        for (int cislo = 1; cislo <= cisla; cislo++) {

            //if (cislo % 3 == 0 && cislo % 5 == 0) {
              //  System.out.println("FizzBuzz");
            if (cislo % 3 == 0) {
                System.out.println("Fizz");
            }
            if (cislo % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(cislo);
            }


            }
            scr.close();


        }
    }

