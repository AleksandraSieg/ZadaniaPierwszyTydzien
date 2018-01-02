package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeltaFunkcjiKwadratowejTest {
    DeltaFunkcjiKwadratowej delta = new DeltaFunkcjiKwadratowej();
    @Test
    public void test1deltaFunkcjiKwadratowej() throws Exception {
        double wynik = delta.deltaFunkcjiKwadratowej(4.0, 2.0, 8.0);
        assertEquals(-124.0, wynik, 0);
    }

    @Test
    public void test2deltaFunkcjiKwadratowej() throws Exception {
        double wynik = delta.deltaFunkcjiKwadratowej(0.0, 0.0, 0.0);
        assertEquals(0.0, wynik, 0.0);
    }

    @Test
    public void test3deltaFunkcjiKwadratowej() throws Exception {
        double wynik = delta.deltaFunkcjiKwadratowej(0.0, -2.0, 0.0);
        assertEquals(4.0, wynik, 0.0);
    }

    @Test
    public void test4deltaFunkcjiKwadratowej() throws Exception {

    }

}