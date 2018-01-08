package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class PanTuNieStal {


    public List<String> panTuNieStal(String wyrazenie) {
        wyrazenie = "PanTuNieStał";
        List<String> wyrazy = new ArrayList<String>();

        String[] podzielone = wyrazenie.split("(?=[A-Z])");

        for (int i = 0; i < podzielone.length; i++) {
            wyrazy.add(podzielone[i]);
        }

        return wyrazy;
    }

    public List<String> maleLitery(List<String> a) {
        a = panTuNieStal("PanTuNieStał");

        List<String> b = new ArrayList<String>();

        for (String s : a) {
            b.add(s.toLowerCase());
        }

        return b;
    }
}
