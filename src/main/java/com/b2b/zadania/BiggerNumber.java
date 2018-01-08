package com.b2b.zadania;

public class BiggerNumber {
    //9. Napisz program, który wyświetli liczbę większą spośród dwóch liczb podanych przez użytkownika.

    public String biggerNumber(int number1, int number2) {
        String wantedNumber = "";

        if(number1>number2){
            wantedNumber = "" + number1;
        }else if(number2>number1) {
            wantedNumber = "" + number2;
        }else {
            wantedNumber = "equals";
        }

        return wantedNumber;
    }
}
