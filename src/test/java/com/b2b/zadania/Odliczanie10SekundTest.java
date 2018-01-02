package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Odliczanie10SekundTest {
    Odliczanie10Sekund odliczanie10Sekund = new Odliczanie10Sekund();

    @Test
    public void odliczanie10SekundTest1() throws Exception {
        List<Integer> wynik = odliczanie10Sekund.odliczanie10Sekund();
        List<Integer> spodziewanyWynik = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertEquals(spodziewanyWynik, wynik);
    }

    @Test
    public void odliczanie10SekundTest2() throws Exception {
        List<Integer> wynik = odliczanie10Sekund.odliczanie10Sekund();
        List<Integer> spodziewanyWynik = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertNotEquals(spodziewanyWynik, wynik);
    }

    @Test
    public void odliczanie10SekundTest3() throws Exception {
        List<Integer> wynik = odliczanie10Sekund.odliczanie10Sekund();
        List<Integer> spodziewanyWynik = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertNotEquals(spodziewanyWynik, wynik);
    }

    @Test
    public void odliczanie10SekundTest4() throws Exception {
        List<Integer> wynik = odliczanie10Sekund.odliczanie10Sekund();
        List<Integer> spodziewanyWynik = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertNotEquals(spodziewanyWynik, wynik);
    }

    @Test
    public void odliczanie10SekundTest5() throws Exception {
        int wynik = odliczanie10Sekund.odliczanie10Sekund().size();
        int spodziewanyWynik = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).size();
        assertNotEquals(spodziewanyWynik, wynik);
    }

    @Test
    public void odliczanie10SekundTest6() throws Exception {
        int wynik = odliczanie10Sekund.odliczanie10Sekund().size();
        int spodziewanyWynik = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).size();
        assertNotEquals(spodziewanyWynik, wynik);
    }


}