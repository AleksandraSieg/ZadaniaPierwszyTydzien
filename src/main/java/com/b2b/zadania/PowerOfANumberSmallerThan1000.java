package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class PowerOfANumberSmallerThan1000 {
    //1. Napisz program, w którym użytkownik poda liczbę,
    // a następnie zostaną wyświetlone potęgi tej liczby nie większe niż 1000.

    public List<Integer> powerOfANumber(int no) {
        List<Integer> powers = new ArrayList<Integer>();
        int result = 1;
        powers.add(result);
        while (1000 > result) {
            result = result * no;
            if (result <= 1000) {
                powers.add(result);
            }
        }
        return powers;
    }
}
