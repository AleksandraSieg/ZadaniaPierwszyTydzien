package com.b2b.zadania;

public class PotegaLiczby4 {
    //18. Napisz program, który sprawdzi czy podana przez użytkownika liczba jest potęgą liczby 4.

    public boolean potegaLiczby4(int liczba) {
        boolean wynik = false;
        int mnozenie = 1;

        do {
            mnozenie = mnozenie * 4;
        } while (mnozenie < liczba && mnozenie != liczba);

        if (mnozenie == liczba) {
            wynik = true;
        } else {
            wynik = false;
        }

        return wynik;
    }
}
