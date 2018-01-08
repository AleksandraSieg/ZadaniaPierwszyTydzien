package com.b2b.zadania;

public class PositiveNumberNegativeNumber {
    // 12. Napisz program, który sprawdzi czy podana przez użytkownika liczba jest ujemna czy dodatnia.

    public String checkIfPositiveOrNegative(int number) {
        String statement = "";
        if(number>0){
            statement = "The number is positive";
        }else if(number<0){
            statement = "The number is negative";
        }else {
            statement = "The number is 0";
        }

        return statement;
    }
}
