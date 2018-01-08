package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class DividersNo68 {
    //3. Napisz program, który wyświetli wszystkie dzielniki liczby 68.

    public List<Integer> dividersNo68() {
        List<Integer> dividers = new ArrayList<Integer>();

        for (int i = 1; i <= 68; i++) {
            if (68 % i == 0) {
                dividers.add(i);
            }
        }

        return dividers;
    }
}
