package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DividersNo68Test {
    DividersNo68 dividers = new DividersNo68();

    @Test
    public void dividersNo68() throws Exception {
        List<Integer> result = dividers.dividersNo68();
        List<Integer> expected = Arrays.asList(1, 2, 4, 17, 34, 68);
        assertEquals(expected, result);
    }

    @Test
    public void numberOfDividers() throws Exception {
        int result = dividers.dividersNo68().size();
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void notEqualsDividersNo68() throws Exception {
        List<Integer> result = dividers.dividersNo68();
        List<Integer> expected = Arrays.asList(3, 8, 2, 9, 7);
        assertNotEquals(expected, result);
    }

}