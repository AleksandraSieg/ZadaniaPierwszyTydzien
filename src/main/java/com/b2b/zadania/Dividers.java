package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class Dividers {
    // 4. Napisz program, który wyświetli wszystkie dzielniki liczby, która zostanie podana przez użytkownika.

    public List<Integer> dividers(int no) {
        List<Integer> dividers = new ArrayList<Integer>();

        for(int i = 1; i<=no; i++){
            if(no%i==0){
                dividers.add(i);
            }
        }
        return dividers;
    }
}
