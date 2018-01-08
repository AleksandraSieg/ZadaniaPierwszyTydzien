package com.b2b.zadania;

import java.util.Arrays;
import java.util.List;

public class TheSmallestNumber {

    //14. Napisz program, który wyświetli najmniejszą spośród 4 liczb podanych przez użytkownika.

    public int theSmallestNumber(int number1, int number2, int number3, int number4) {
        List<Integer> numbers = Arrays.asList(number1, number2, number3, number4);

        int wantedNumber = number1;
        for (Integer n : numbers) {
            if (n < wantedNumber) {
                wantedNumber = n;
            }
        }

        return wantedNumber;
    }
}
