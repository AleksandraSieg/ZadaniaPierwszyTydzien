package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PotegiLiczby8Test {
    PotegiLiczby8 zadanie = new PotegiLiczby8();

    @Test
    public void test1PotegiLiczby8() throws Exception {

        List<Integer> wynik = zadanie.potegiLiczby8();
        List<Integer> oczekiwanyWynik = Arrays.asList(1, 8, 64, 512, 4096);

        assertEquals(oczekiwanyWynik, wynik);
    }

    @Test
    public void test2PotegiLiczby8() throws Exception {

        int wynikDlugosc = zadanie.potegiLiczby8().size();
        int oczekiwanaDlugosc = 5;

        assertEquals(oczekiwanaDlugosc, wynikDlugosc);
    }

    @Test
    public void test3PotegiLiczby8() throws Exception {
        List<Integer> wynik = zadanie.potegiLiczby8();
        List<Integer> wynikNieoczekiwany = Arrays.asList(0, 8, 64, 512, 4096);

        assertNotEquals(wynikNieoczekiwany, wynik);
    }

    @Test
    public void test4PotegiLiczby8() throws Exception {
        List<Integer> wynik = zadanie.potegiLiczby8();
        List<Integer> wynikNieoczekiwany = Arrays.asList(1, 8, 64, 512);

        assertNotEquals(wynikNieoczekiwany, wynik);
    }

    @Test
    public void test5PotegiLiczby8() throws Exception {
        List<Integer> wynik = zadanie.potegiLiczby8();
        List<Integer> wynikNieoczekiwany = Arrays.asList(8, 64, 512, 4096);

        assertNotEquals(wynikNieoczekiwany, wynik);
    }

    @Test
    public void test6PotegiLiczby8() throws Exception {
        List<Integer> wynik = zadanie.potegiLiczby8();
        assertNotNull("musi byc pusty!", wynik);
    }

    @Test
    public void test7PotegiLiczby8() throws Exception {
        boolean wynik = false;

        int dlugosc = zadanie.potegiLiczby8().size();
        int dlugoscOczekiwana = 5;
        if(dlugosc == dlugoscOczekiwana){
            wynik = true;
        }

        assertTrue(wynik);
    }

    @Test
    public void test1PotegiLiczby8DrugieRozwiazenie() throws Exception {

        List<Double> wynik = zadanie.potegiLiczby8DrugieRozwiazanie();
        List<Double> oczekiwanyWynik = Arrays.asList(1D, 8D, 64D, 512D, 4096D);

        assertEquals(oczekiwanyWynik, wynik);
    }

    @Test
    public void test2PotegiLiczby8DrugieRozwiazanie() throws Exception {

        int wynikDlugosc = zadanie.potegiLiczby8DrugieRozwiazanie().size();
        int oczekiwanaDlugosc = 5;

        assertEquals(oczekiwanaDlugosc, wynikDlugosc);
    }

    @Test
    public void test3PotegiLiczby8DrugieRozwiazanie() throws Exception {
        List<Double> wynik = zadanie.potegiLiczby8DrugieRozwiazanie();
        List<Double> wynikNieoczekiwany = Arrays.asList(0D, 8D, 64D, 512D, 4096D);

        assertNotEquals(wynikNieoczekiwany, wynik);
    }

    @Test
    public void test4PotegiLiczby8DrugieRozwiazanie() throws Exception {
        List<Double> wynik = zadanie.potegiLiczby8DrugieRozwiazanie();
        List<Double> wynikNieoczekiwany = Arrays.asList(1D, 8D, 64D, 512D);

        assertNotEquals(wynikNieoczekiwany, wynik);
    }

    @Test
    public void test5PotegiLiczby8DrugieRozwiazanie() throws Exception {
        List<Double> wynik = zadanie.potegiLiczby8DrugieRozwiazanie();
        List<Double> wynikNieoczekiwany = Arrays.asList(8D, 64D, 512D, 4096D);

        assertNotEquals(wynikNieoczekiwany, wynik);
    }

    @Test
    public void test6PotegiLiczby8DrugieRozwiazanie() throws Exception {
        List<Double> wynik = zadanie.potegiLiczby8DrugieRozwiazanie();
        assertNotNull("musi byc pusty!", wynik);
    }

    @Test
    public void test7PotegiLiczby8DrugieRozwiazanie() throws Exception {
        boolean wynik = false;

        int dlugosc = zadanie.potegiLiczby8DrugieRozwiazanie().size();
        int dlugoscOczekiwana = 5;
        if (dlugosc == dlugoscOczekiwana) {
            wynik = true;
        }

        assertTrue(wynik);
    }
}