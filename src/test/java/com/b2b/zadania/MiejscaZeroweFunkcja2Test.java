package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiejscaZeroweFunkcja2Test {
    MiejscaZeroweFunkcja2 zadanie = new MiejscaZeroweFunkcja2();

    @Test
    public void delta() throws Exception {
        double wynik = zadanie.delta();
        double oczekiwanyWynik = -464.0;
        assertEquals(oczekiwanyWynik, wynik, 0.5);
    }

    @Test(expected = AssertionError.class)
    public void pierwszeMiejsceZerowe() throws Exception {
        double wynik = zadanie.pierwszeMiejsceZerowe();
        String oczekiwanyWynik = "NaN";
        assertEquals(oczekiwanyWynik, wynik);
    }

    @Test(expected = AssertionError.class)
    public void drugieMiejsceZerowe() throws Exception {
        double wynik = zadanie.drugieMiejsceZerowe();
        String oczekiwanyWynik = "NaN";
        assertEquals(oczekiwanyWynik, wynik);
    }

}