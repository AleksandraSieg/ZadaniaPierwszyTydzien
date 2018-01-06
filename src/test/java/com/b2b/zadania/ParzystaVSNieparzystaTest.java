package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParzystaVSNieparzystaTest {
    ParzystaVSNieparzysta liczba = new ParzystaVSNieparzysta();

    @Test
    public void czyParzystaCzyNieparzystaTest1() throws Exception {
        String wynik = liczba.czyParzystaCzyNieparzysta(4);
        String oczekiwany = "parzysta";
        assertEquals(oczekiwany, wynik);
    }

    @Test
    public void czyParzystaCzyNieparzystaTest2() throws Exception {
        String wynik = liczba.czyParzystaCzyNieparzysta(3);
        String oczekiwany = "nieparzysta";
        assertEquals(oczekiwany, wynik);
    }

    @Test
    public void czyParzystaCzyNieparzystaTest3() throws Exception {
        String wynik = liczba.czyParzystaCzyNieparzysta(2);
        String oczekiwany = "nieparzysta";
        assertNotEquals(oczekiwany, wynik);
    }

    @Test
    public void czyParzystaCzyNieparzystaTest4() throws Exception {
        String wynik = liczba.czyParzystaCzyNieparzysta(5);
        String oczekiwany = "parzysta";
        assertNotEquals(oczekiwany, wynik);
    }

    @Test
    public void czyParzystaCzyNieparzystaTest5() throws Exception {
        String wynik = liczba.czyParzystaCzyNieparzysta(1);
        String oczekiwany = "nieparzysta";
        assertEquals(oczekiwany, wynik);
    }

    @Test
    public void czyParzystaCzyNieparzystaTest6() throws Exception {
        String wynik = liczba.czyParzystaCzyNieparzysta(0);
        String oczekiwany = "parzysta";
        assertEquals(oczekiwany, wynik);
    }

}