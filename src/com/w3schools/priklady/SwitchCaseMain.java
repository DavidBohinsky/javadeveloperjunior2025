package com.w3schools.priklady;

import java.util.Scanner;

public class SwitchCaseMain {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Zadaj teplotu vody: ");
        Double teplota = scr.nextDouble();
        double fahrenheit = (teplota * 9/5) + 32;



        if (teplota <= 0) {
            System.out.println("Ľad ktorý má " + teplota + " C Celzia. Premena do fahrenheita je " + fahrenheit);
        }
        else if
        (teplota >= 100) {
            System.out.println("Para ktorá má " + teplota + " C Celzia. Premena do fahrenheita je " + fahrenheit);
        }
        else if
        (teplota < 100 && teplota > 0) {
            System.out.println("Voda ktorá má " + teplota + " C Celzia. Premena do fahrenheita je " + fahrenheit);
        }

        scr.close();


    }
}

