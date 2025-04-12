package com.w3schools.priklady;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class ArrayListUlohaMainTest {


    private ArrayList<Double> cisla;

    @BeforeEach
    void setUp() {
        cisla = new ArrayList<>();
    }

    @Test
    void testBezcisla() {
        ArrayList<Double> cisla = new ArrayList<>();
        assertEquals(0.00, ArrayListUlohabezStaticMain.scitanie(cisla));
    }

    @Test
    void testScitaniejednoCislo() {
        ArrayList<Double> cisla = new ArrayList<>();
        cisla.add(5.678);
        assertEquals(5.68, ArrayListUlohabezStaticMain.scitanie(cisla));
    }


    @Test
    void testScitaniesNulou() {
        ArrayList<Double> cisla = new ArrayList<>();
        cisla.add(0.0);
        cisla.add(10.123);
        assertEquals(10.12, ArrayListUlohabezStaticMain.scitanie(cisla));
    }
}
