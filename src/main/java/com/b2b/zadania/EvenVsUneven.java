package com.b2b.zadania;

public class EvenVsUneven {

    //16. Napisz program, który wyświetli komunikat,
    // czy podana przez użytkownika liczba jest parzysta albo nieparzysta.

    public String isEvenOrIsUneven(int no) {
        String result = "";

        if (no % 2 == 0) {
            result = "even";
        } else if (no % 2 == 1) {
            result = "uneven";
        }

        return result;
    }

}
