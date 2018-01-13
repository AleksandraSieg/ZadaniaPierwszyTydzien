package com.b2b.zadania;

import java.util.Arrays;
import java.util.List;

public class TheBiggestNumberDividedBy3 {
    // 11. Napisz program, który spośród pięciu liczb podanych przez użytkownika,
    // wyświetli największą, która jest podzielna przez 3 bez reszty.

    public int theBiggestNumberDividedBy3(int no1, int no2, int no3,
                                                   int no4, int no5){
        List<Integer> numbers = Arrays.asList(no1, no2, no3, no4, no5);

        int secondaryNumber = 0;

        for (Integer i : numbers) {
            if(i>secondaryNumber && i%3==0){
                secondaryNumber = i;
            }
        }

        return secondaryNumber;
    }
}
