package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class PotegaLiczby4Test {
    PotegaLiczby4 potega = new PotegaLiczby4();

    @Test
    public void potegaLiczby4Test1() throws Exception {
        boolean wynik = potega.potegaLiczby4(16);
        assertTrue(wynik);
    }

    @Test
    public void potegaLiczby4Test2() throws Exception {
        boolean wynik = potega.potegaLiczby4(13);
        assertFalse(wynik);
    }

    @Test
    public void potegaLiczby4Test3() throws Exception {
        boolean wynik = potega.potegaLiczby4(15);
        assertFalse(wynik);
    }

    @Test
    public void potegaLiczby4Test4() throws Exception {
        boolean wynik = potega.potegaLiczby4(256);
        assertTrue(wynik);
    }

    @Test
    public void potegaLiczby4Test5() throws Exception {
        boolean wynik = potega.potegaLiczby4(64);
        assertTrue(wynik);
    }

    @Test
    public void potegaLiczby4Test6() throws Exception {
        boolean wynik = potega.potegaLiczby4(4);
        assertTrue(wynik);
    }

    @Test
    public void potegaLiczby4Test7() throws Exception {
        boolean wynik = potega.potegaLiczby4(0);
        assertFalse(wynik);
    }

    @Test(expected = AssertionError.class)
    public void potegaLiczby4Test8() throws Exception {
        boolean wynik = potega.potegaLiczby4(0);
        assertTrue(wynik);
    }

    @Test(expected = AssertionError.class)
    public void potegaLiczby4Test9() throws Exception {
        boolean wynik = potega.potegaLiczby4(1);
        assertTrue(wynik);
    }
}