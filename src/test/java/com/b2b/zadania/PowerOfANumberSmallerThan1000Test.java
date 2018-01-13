package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PowerOfANumberSmallerThan1000Test {
    PowerOfANumberSmallerThan1000 power = new PowerOfANumberSmallerThan1000();

    @Test
    public void powersOfANumber8() throws Exception {
        List<Integer> result = power.powerOfANumber(8);
        List<Integer> expected = Arrays.asList(1, 8, 64, 512);
        assertEquals(expected, result);
    }

    @Test
    public void powersOfNumber2() throws Exception {
        List<Integer> result = power.powerOfANumber(2);
        List<Integer> expected = Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512);
        assertEquals(expected, result);
    }

    @Test
    public void powersOfNumber88() throws Exception {
        List<Integer> result = power.powerOfANumber(88);
        List<Integer> expected = Arrays.asList(1, 88);
        assertEquals(expected, result);
    }

    @Test
    public void checkIfNotEqualsPowersOfNumber12() throws Exception {
        List<Integer> result = power.powerOfANumber(12);
        List<Integer> expected = Arrays.asList(1, 12, 144, 1728);
        assertNotEquals(expected, result);
    }

    @Test
    public void checkIfThereIsTheSameAmountOfPowersOfNumber9() throws Exception {
        int result = power.powerOfANumber(9).size();
        int expected = 4;
        assertEquals(expected, result);
    }
}