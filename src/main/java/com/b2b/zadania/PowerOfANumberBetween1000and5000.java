package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class PowerOfANumberBetween1000and5000 {
    //2. Napisz program, w którym użytkownik poda liczbę,
    // a następnie zostaną wyświetlone potęgi tej liczby, które mieszczą się w zakresie od 1000 do 5000.

    public List<Integer> poweroOfANumber(int no) {
        List<Integer> powers = new ArrayList<Integer>();

        int result = 1;
        while (result < 5000) {
            result = result * no;
            if (result > 1000 && result <= 5000) {
                powers.add(result);
            }
        }
        return powers;
    }
}
