package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheSmallestNumberTest {
    TheSmallestNumber theSmallestNumberMethod = new TheSmallestNumber();

    @Test
    public void if4IsTheSmallestNumber() throws Exception {
        int realResult = theSmallestNumberMethod.theSmallestNumber(5, 4, 6, 8);
        int expectedResult = 4;
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void if0IsTheSmallestNumber() throws Exception {
        int realResult = theSmallestNumberMethod.theSmallestNumber(1, 2, 0, 9);
        int expectedResult = 0;
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void ifMinus5IsTheSmallestNumber() throws Exception {
        int realResult = theSmallestNumberMethod.theSmallestNumber(-5, -2, 40, 1);
        int notTheSmallestNumber = -5;
        assertEquals(notTheSmallestNumber, realResult);
    }

    @Test
    public void if7IsNotTheSmallestNumber() throws Exception {
        int realResult = theSmallestNumberMethod.theSmallestNumber(-30, 9, 7, 10);
        int notTheSmallestNumber = 7;
        assertNotEquals(notTheSmallestNumber, realResult);
    }

    @Test
    public void ifMinus100IsNotTheRealNumber() throws Exception {
        int realResult = theSmallestNumberMethod.theSmallestNumber(-1000, -500, 0, -100);
        int expectedResult = -100;
        assertNotEquals(expectedResult, realResult);
    }

}