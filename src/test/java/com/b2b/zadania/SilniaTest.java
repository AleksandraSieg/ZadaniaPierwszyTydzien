package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class SilniaTest {
    Silnia silnia = new Silnia();

    @Test
    public void silniaTest1() throws Exception {
        int wynik = silnia.silnia(4);
        int oczekiwanyWynik = 24;
        assertEquals(oczekiwanyWynik, wynik);
    }

    @Test
    public void silniaTest2() throws Exception {
        int wynik = silnia.silnia(1);
        int oczekiwanyWynik = 1;
        assertEquals(oczekiwanyWynik, wynik);
    }

    @Test
    public void silniaTest3() throws Exception {
        int wynik = silnia.silnia(10);
        int oczekiwanyWynik = 3628800;
        assertEquals(oczekiwanyWynik, wynik);
    }

    @Test
    public void silniaTest4() throws Exception {
        int wynik = silnia.silnia(4);
        int oczekiwanyWynik = 23;
        assertNotEquals(oczekiwanyWynik, wynik);
    }

    @Test
    public void silniaTest5() throws Exception {
        int wynik = silnia.silnia(4);
        int oczekiwanyWynik = 25;
        assertNotEquals(oczekiwanyWynik, wynik);
    }

}