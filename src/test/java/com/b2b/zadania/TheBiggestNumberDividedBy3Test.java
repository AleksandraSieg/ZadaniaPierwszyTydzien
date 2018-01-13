package com.b2b.zadania;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TheBiggestNumberDividedBy3Test {
    TheBiggestNumberDividedBy3 theBiggestNumber = new TheBiggestNumberDividedBy3();

    @Test
    public void if48IsTheBiggestNumberDividedBy3() throws Exception {
        int result = theBiggestNumber.theBiggestNumberDividedBy3(3, 12, 30, 48, 100);
        assertEquals(48, result);
    }

    @Test
    public void if30IsTheBiggestNumberDividedBy3() throws Exception {
        int result = theBiggestNumber.theBiggestNumberDividedBy3(3, 12, 30, 31, 100);
        assertEquals(30, result);
    }

    @Test
    public void if39IsTheBiggestNumberDividedBy3() throws Exception {
        int result = theBiggestNumber.theBiggestNumberDividedBy3(3, 12, 30, 49, 39);
        assertEquals(39, result);
    }

    @Test
    public void if48IsNotTheBiggestNumberDividedBy3() throws Exception {
        int result = theBiggestNumber.theBiggestNumberDividedBy3(3, 12, 30, 48, 120);
        assertNotEquals(48, result);
    }

}