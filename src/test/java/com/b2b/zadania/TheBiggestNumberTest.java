package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheBiggestNumberTest {
    TheBiggestNumber theBiggest = new TheBiggestNumber();

    @Test
    public void is10theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(1, 2, 3, 4, 5,
                6, 7, 8, 9, 10);
        int expected = 10;
        assertEquals(expected, result);
    }

    @Test
    public void is12theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(1, 2, 12, 4, 5,
                6, 7, 8, 9, 10);
        int expected = 12;
        assertEquals(expected, result);
    }

    @Test
    public void is23theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(23, 2, 3, 4, 5,
                6, 7, 8, 9, 10);
        int expected = 23;
        assertEquals(expected, result);
    }

    @Test
    public void is0theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(-1, 0, -3, -4, -5,
                -6, 0, -8, -9, -10);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void isMinus10theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(-101, -20, -31, -10, -545,
                -63, -711, -89, -999, -109);
        int expected = -10;
        assertEquals(expected, result);
    }

    @Test
    public void isNot10theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(100, 2, 3, 4, 5,
                6, 7, 8, 9, 10);
        int expected = 10;
        assertNotEquals(expected, result);
    }

    @Test
    public void isNot1theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(1, 2, 3, 4, 5,
                6, 7, 8, 9, 10);
        int expected = 10;
        assertEquals(expected, result);
    }

    @Test
    public void isNot12theBiggestNumber() throws Exception {
        int result = theBiggest.theBiggestNumber(-1, 44, 3, 4, 5,
                6, 7, 8, 9, 12);
        int expected = 10;
        assertNotEquals(expected, result);
    }

}