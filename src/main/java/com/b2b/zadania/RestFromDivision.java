package com.b2b.zadania;

public class RestFromDivision {
    //7. Napisz program, który pozwoli użytkownikowi
    // wprowadzić dwie liczby a następnie wyświetli resztę z ich dzielenia.

    public String rest(int number1, int number2) {
        String statement = "";

        if (number2 != 0) {
            int result = number1 % number2;
            statement = "" + result;
        }else{
            statement = "can't divide by zero!!";
        }

        return statement;
    }
}
