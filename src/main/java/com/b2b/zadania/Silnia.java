package com.b2b.zadania;

public class Silnia {

    //22. Napisz program, który wyliczy silnię, z podanej przez użytkownika liczby.

    public int silnia(int liczba){
        int mnozenie = 1;

        for(int i = liczba; i>=1; i--){
            mnozenie = mnozenie*i;
        }

        return mnozenie;
    }
}
