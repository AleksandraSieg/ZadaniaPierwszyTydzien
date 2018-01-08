package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheSumOfEveryNumberSmallerThen500Test {
    TheSumOfEveryNumberSmallerThen500 sum = new TheSumOfEveryNumberSmallerThen500();

    @Test
    public void if125250IsTheSum() throws Exception {
        int result = sum.sum();
        int expected = 125250;
        assertEquals(expected, result);
    }

    @Test
    public void if125249IsNotTheSum() throws Exception {
        int result = sum.sum();
        int expected = 125249;
        assertNotEquals(expected, result);
    }

    @Test
    public void if125251IsNotTheSum() throws Exception {
        int result = sum.sum();
        int expected = 125251;
        assertNotEquals(expected, result);
    }



}