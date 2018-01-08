package com.b2b.zadania;

import java.util.Arrays;
import java.util.List;

public class TheBiggestNumber {
    // 10. Napisz program, który wyświetli największą
    // liczbę spośród dziesięciu liczb podanych przez użytkownika.

    public int theBiggestNumber(int no1, int no2, int no3, int no4, int no5, int no6, int no7,
    int no8, int no9, int no10) {
        List<Integer> numbers = Arrays.asList(no1, no2, no3, no4, no5, no6, no7, no8, no9, no10);

        int wantedNumber = no1;

        for (Integer no : numbers) {
            if(no>wantedNumber){
                wantedNumber = no;
            }
        }

        return wantedNumber;
    }
}
