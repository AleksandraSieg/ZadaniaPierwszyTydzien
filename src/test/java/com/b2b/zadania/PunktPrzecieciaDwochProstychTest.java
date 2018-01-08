package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PunktPrzecieciaDwochProstychTest {
    PunktPrzecieciaDwochProstych punkt = new PunktPrzecieciaDwochProstych();

    @Test
    public void punktPrzecieciaTest1() throws Exception {
        List<Double> wynik = punkt.punktPrzeciecia();
        List<Double> wynikOczekiwany = Arrays.asList(115.0, 425.0);

        assertEquals(wynikOczekiwany, wynik);
    }

    @Test
    public void punktPrzecieciaTest2() throws Exception {
        double wynik1 = 3 * 115.0 + 80;
        double wynik2 = 4 * 115.0 - 35;

        assertEquals(wynik1, wynik2, 0.0);
    }

}