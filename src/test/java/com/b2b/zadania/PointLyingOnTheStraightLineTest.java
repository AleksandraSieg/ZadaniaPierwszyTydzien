package com.b2b.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointLyingOnTheStraightLineTest {
    PointLyingOnTheStraightLine point = new PointLyingOnTheStraightLine();

    @Test
    public void ifX0AndY40LayOnStraightLine() throws Exception {
        boolean result = point.pointOnAStraightLine(0, 40);
        assertTrue(result);
    }

    @Test
    public void ifX1AndY40LayOnStraightLine() throws Exception {
        boolean result = point.pointOnAStraightLine(1, 40);
        assertFalse(result);
    }

    @Test
    public void ifX0AndY1LayOnStraightLine() throws Exception {
        boolean result = point.pointOnAStraightLine(0, 1);
        assertFalse(result);
    }

    @Test
    public void ifX10AndY70LayOnStraightLine() throws Exception {
        boolean result = point.pointOnAStraightLine(10, 70);
        assertTrue(result);
    }

    @Test
    public void ifXMinus10AndY10LayOnStraightLine() throws Exception {
        boolean result = point.pointOnAStraightLine(-10, 10);
        assertTrue(result);
    }

}