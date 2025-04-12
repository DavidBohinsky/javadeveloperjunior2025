package com.w3schools.priklady.oop;

import sk.tmconsulting.ulohy.Autor;

public class Kniha {
    String nazov;
    int rokVydania;
    String autor; // Zatial zjednodusujeme, autor bude obsahovat meno a priezvisko
    int pocetStran;
    String vydavatelstvo; // Zatial pouzijeme iba jeho nazov

    public Kniha(String nazov, int rokVydania, String autor, int pocetStran, String vydavatelstvo) {
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.autor = autor;
        this.pocetStran = pocetStran;
        this.vydavatelstvo = vydavatelstvo;
    }

    public Kniha() {
        nazov = "Já, robot";
        autor = "Isaac Asimov";
        rokVydania = 1960;
        pocetStran = 289;
        vydavatelstvo = "Asimov Inc.";
    }

    public void setAutor(String autor) {            //*******
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getNazov() {
        return nazov;
    }

    public String getVydavatelstvo() {
        return vydavatelstvo;
    }

    public void setVydavatelstvo(String vydavatelstvo) {
        this.vydavatelstvo = vydavatelstvo;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazov='" + nazov + '\'' +
                ", rokVydania=" + rokVydania +
                ", autor='" + autor + '\'' +
                ", pocetStran=" + pocetStran +
                ", vydavatelstvo='" + vydavatelstvo + '\'' +
                '}';
    }
}
