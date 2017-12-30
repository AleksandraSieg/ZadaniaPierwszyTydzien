package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class PotegiLiczby8 {

    /*
    Wyświetl potęgi liczby 8 mniejsze od 10000(dodaj je do Listy).
     */

    public List<Integer> potegiLiczby8() {
        List<Integer> potegi = new ArrayList<Integer>();
        int mnozenie = 1;
        potegi.add(1);

        do {
            mnozenie = mnozenie * 8;
            if (mnozenie < 10000) {
                potegi.add(mnozenie);
            }

        } while (mnozenie < 10000);

        return potegi;
    }

    public List<Double> potegiLiczby8DrugieRozwiazanie() {
        List<Double> potegi = new ArrayList<Double>();

        for(int i = 0; i<6; i++){
            double wynik = Math.pow(8,i);
            if(wynik<10000){
                potegi.add(wynik);
            }
        }

        return potegi;
    }
}
