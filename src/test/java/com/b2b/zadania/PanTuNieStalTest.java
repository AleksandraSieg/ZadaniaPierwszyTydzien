package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PanTuNieStalTest {
    @Test
    public void panTuNieStal() throws Exception {
        PanTuNieStal panTuNieStal = new PanTuNieStal();
        List<String> wynik = panTuNieStal.panTuNieStal("PanTuNieStał");
        List<String> szukam = Arrays.asList("Pan", "Tu", "Nie", "Stał");

        assertEquals(szukam, wynik);
    }

}