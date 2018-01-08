package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {
    Division division = new Division();

    @Test
    public void division4And2() throws Exception {
        String result = division.division(4.0, 2.0);
        String expected = "2";
        assertEquals(expected, result);
    }

    @Test
    public void division4And0() throws Exception {
        String result = division.division(4.0, 0);
        String expected = "can't devide by zero!!";
        assertEquals(expected, result);
    }

    @Test
    public void division3And2() throws Exception {
        String result = division.division(3.0, 2.0);
        String expected = "1.5";
        assertEquals(expected, result);
    }

}