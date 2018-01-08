package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class DodawanieOdejmowanieMnozenieDzielenieTest {
    DodawanieOdejmowanieMnozenieDzielenie zadanie = new DodawanieOdejmowanieMnozenieDzielenie();

    @Test
    public void dodawanie() throws Exception {
        double wynik = zadanie.dodawanie(3, 2);
        double oczekiwany = 5.0;
        assertEquals(oczekiwany, wynik, 0.0);
    }

    @Test
    public void odejmowanie() throws Exception {
        double wynik = zadanie.odejmowanie(2, 3);
        double oczekiwany = -1.0;
        assertEquals(oczekiwany, wynik, 0.0);
    }

    @Test
    public void mnozenie() throws Exception {
        double wynik = zadanie.mnozenie(2, 3);
        double oczekiwany = 6.0;
        assertEquals(oczekiwany, wynik, 0.0);
    }

    @Test
    public void dzielenieTest1() throws Exception {
        String wynik = zadanie.dzielenie(3, 2);
        String oczekiwany = "1.5";
        assertEquals(oczekiwany, wynik);
    }

    @Test
    public void dzielenieTest2() throws Exception {
        String wynik = zadanie.dzielenie(3, 0);
        String oczekiwany = "Nie dziel cholero przez zero";
        assertEquals(oczekiwany, wynik);
    }

}