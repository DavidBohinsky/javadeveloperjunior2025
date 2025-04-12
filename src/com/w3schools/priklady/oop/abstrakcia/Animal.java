package com.w3schools.priklady.oop.abstrakcia;

abstract class Animal {
    protected int feets = 4;
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}
