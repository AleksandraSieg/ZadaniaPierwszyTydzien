package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DividersTest {
    Dividers dividers = new Dividers();

    @Test
    public void dividersNo6() throws Exception {
        List<Integer> result = dividers.dividers(6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 6);
        assertEquals(expected, result);
    }

    @Test
    public void dividersNo0() throws Exception {
        List<Integer> result = dividers.dividers(0);
        List<Integer> expected = dividers.dividers(0);
        assertEquals(expected, result);
    }

    @Test
    public void numberOfDividersNo10() throws Exception {
        int result = dividers.dividers(10).size();
        assertEquals(4, result);
    }

    @Test
    public void notNumberOfDividersNo13() throws Exception {
        int result = dividers.dividers(13).size();
        assertNotEquals(3, result);
    }

    @Test
    public void dividersNo7() throws Exception {
        List<Integer> result = dividers.dividers(7);
        assertEquals(Arrays.asList(1,7), result);
    }

}