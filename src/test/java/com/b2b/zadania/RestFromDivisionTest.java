package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestFromDivisionTest {
    RestFromDivision rest = new RestFromDivision();

    @Test
    public void restFrom23DividedBy4() throws Exception {
        String result = rest.rest(23,4);
        String expected = "3";
        assertEquals(expected,result);
    }

    @Test
    public void restFrom7DividedByMinus3() throws Exception {
        String result = rest.rest(7,-3);
        String expected = "1";
        assertEquals(expected,result);
    }

    @Test // nie zgodne z twierdzeniem?
    public void restFromMinus7DividedBy3() throws Exception {
        String result = rest.rest(-7,3);
        String expected = "-1";
        assertEquals(expected,result);
    }

    @Test// nie zgodne z twierdzeniem?
    public void restFromMinus7DividedByMinus3() throws Exception {
        String result = rest.rest(-7,-3);
        String expected = "-1";
        assertEquals(expected,result);
    }

    @Test
    public void restFrom7DividedByMinus0() throws Exception {
        String result = rest.rest(7,0);
        String expected = "can't divide by zero!!";
        assertEquals(expected,result);
    }

    @Test
    public void notEqualsDevidedBy4() throws Exception {
        String result = rest.rest(24,4);
        String expected = "4";
        assertNotEquals(expected,result);
    }
}