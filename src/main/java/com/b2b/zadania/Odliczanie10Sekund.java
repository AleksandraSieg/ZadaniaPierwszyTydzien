package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class Odliczanie10Sekund {
    //17. Napisz program, który będzie odliczał od końca 10 sekund.
    public List<Integer> odliczanie10Sekund() {
        List<Integer> licznik = new ArrayList<Integer>();

        for (int i = 10; i >= 1; i--) {
            licznik.add(i);
        }

        return licznik;
    }
}
