package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PowerOfANumberBetween1000and5000Test {
    PowerOfANumberBetween1000and5000 power = new PowerOfANumberBetween1000and5000();

    @Test
    public void powersOfANumber6() throws Exception {
        List<Integer> result = power.poweroOfANumber(6);
        List<Integer> expected = Arrays.asList(1296);

        assertEquals(expected, result);
    }

    @Test
    public void powersOfANumber2() throws Exception {
        List<Integer> result = power.poweroOfANumber(2);
        List<Integer> expected = Arrays.asList(1024, 2048, 4096);
    }

    @Test
    public void powersOfNumber18() throws Exception {
        List<Integer> result = power.poweroOfANumber(18);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, result);
    }

    @Test
    public void checkIfNotEqualsPowersOfNumber9() throws Exception {
        List<Integer> result = power.poweroOfANumber(9);
        List<Integer> expected = Arrays.asList(729, 6561);
        assertNotEquals(expected, result);
    }

    @Test
    public void checkIfThereIsTheSameAmountOfPowersOfNumber10() throws Exception {
        int result = power.poweroOfANumber(10).size();
        int expected = 1;
        assertNotEquals(expected, power);
    }
}