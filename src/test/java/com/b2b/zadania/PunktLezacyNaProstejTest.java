package com.b2b.zadania;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PunktLezacyNaProstejTest {
    PunktLezacyNaProstej punkt = new PunktLezacyNaProstej();

    @Test
    public void punktLezacyNaProstejTest1() throws Exception {
        boolean wynik = punkt.punktLezacyNaProstej(0, 40);
        assertTrue(wynik);
    }

    @Test
    public void punktLezacyNaProstejTest2() throws Exception {
        boolean wynik = punkt.punktLezacyNaProstej(1, 40);
        assertFalse(wynik);
    }

    @Test
    public void punktLezacyNaProstejTest3() throws Exception {
        boolean wynik = punkt.punktLezacyNaProstej(0, 1);
        assertFalse(wynik);
    }

    @Test
    public void punktLezacyNaProstejTest4() throws Exception {
        boolean wynik = punkt.punktLezacyNaProstej(10, 70);
        assertTrue(wynik);
    }

    @Test
    public void punktLezacyNaProstejTest5() throws Exception {
        boolean wynik = punkt.punktLezacyNaProstej(-10, 10);
        assertTrue(wynik);
    }

}