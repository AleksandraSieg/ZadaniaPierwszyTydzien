package com.b2b.zadania;

public class Age {

    //13. Napisz program, w którym użytkownik podaje swój wiek,
    // a następnie program wyświetli komunikat czy użytkownik jest osobą pełnoletnią.

    public String age(int age) {
        String statement = "";

        if (age >= 18) {
            statement = "You are adult:-)";
        } else {
            statement = "You are not adult";
        }

        return statement;

    }
}
