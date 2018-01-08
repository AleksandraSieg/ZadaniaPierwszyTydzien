package com.b2b.zadania;

public class ParzystaVSNieparzysta {

    //16. Napisz program, który wyświetli komunikat,
    // czy podana przez użytkownika liczba jest parzysta albo nieparzysta.

    public String czyParzystaCzyNieparzysta(int liczba) {
        String odpowiedz = "";

        if (liczba % 2 == 0) {
            odpowiedz = "parzysta";
        } else if (liczba % 2 == 1) {
            odpowiedz = "nieparzysta";
        }

        return odpowiedz;
    }

}
