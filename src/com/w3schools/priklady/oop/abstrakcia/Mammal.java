package com.w3schools.priklady.oop.abstrakcia;

public interface Mammal {
    default void drinkMilk() {
        System.out.println("Drinks mill");
    }
}
