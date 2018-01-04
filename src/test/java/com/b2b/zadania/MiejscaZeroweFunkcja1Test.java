package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiejscaZeroweFunkcja1Test {
    MiejscaZeroweFunkcja1 miejsce = new MiejscaZeroweFunkcja1();

    @Test
    public void delta() throws Exception {
        double wynik = miejsce.delta();
        double oczekiwany = 4129.0;
        assertEquals(oczekiwany, wynik, 0);
    }

    @Test
    public void pierwszeMiejsceZerowe() throws Exception {
        double wynik = miejsce.pierwszeMiejsceZerowe();
        double oczekiwany = 973.0;
        assertEquals(oczekiwany, wynik, 0.4);
    }

    @Test
    public void drugieMiejsceZerowe() throws Exception {
        double wynik = miejsce.drugieMiejsceZerowe();
        double oczekiwany = -1211.3;
        assertEquals(wynik, oczekiwany, 0.4);
    }

}