package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class Times10Test {
    Times10 times10 = new Times10();

    @Test
    public void number3times10() throws Exception {
        int result = times10.times10(3);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void notEquals3Times10() throws Exception {
        int result = times10.times10(3);
        assertNotEquals(29, result);
    }

    @Test
    public void notEquals4Times10() throws Exception {
        int result = times10.times10(40);
        assertNotEquals(41, result);
    }

}