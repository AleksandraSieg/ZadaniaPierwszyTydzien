package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class PanTuNieStal {

    public List<String> panTuNieStal(String wyrazenie){
        wyrazenie = "PanTuNieStał";
        List<String> wyrazy = new ArrayList<String>();

        String[] podzielone = wyrazenie.split("(?=[A-Z])");

        for (int i = 0; i < podzielone.length; i++) {
            wyrazy.add(podzielone[i]);
        }

        return wyrazy;
    }
}
