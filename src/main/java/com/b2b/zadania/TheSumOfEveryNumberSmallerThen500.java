package com.b2b.zadania;

public class TheSumOfEveryNumberSmallerThen500 {
    //8. Napisz program, obliczy sumę liczb od 1 do 500.

    public int sum(){
        int boarderNumber = 500;
        int sum = 0;
        for(int i = 1; i<=500; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
