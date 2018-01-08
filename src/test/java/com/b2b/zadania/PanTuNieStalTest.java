package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PanTuNieStalTest {
    private PanTuNieStal panTuNieStal = new PanTuNieStal();

    @Test
    public void panTuNieStalTest1() throws Exception {
        List<String> wynik = panTuNieStal.panTuNieStal("PanTuNieStał");
        List<String> szukam = Arrays.asList("Pan", "Tu", "Nie", "Stał");

        assertEquals(szukam, wynik);
    }

    @Test
    public void maleLiteryTest1() throws Exception {
        List<String> wynik = panTuNieStal.maleLitery(panTuNieStal.panTuNieStal("PanTuNieStał"));
        List<String> szukam = Arrays.asList("pan", "tu", "nie", "stał");

        assertEquals(szukam, wynik);
    }

}