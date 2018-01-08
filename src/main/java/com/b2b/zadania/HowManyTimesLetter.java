package com.b2b.zadania;

import java.util.*;

public class HowManyTimesLetter {

    //Napisz program, który policzy ile razy wystąpiła każda litera w słowie podanym przez użytkownika.

    public Map<Character, Integer> letterCounter(String word) {
        Map<Character, Integer> countedWord = new TreeMap<Character, Integer>();

        word = word.toLowerCase();

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            for (int k = 0; k < chars.length; k++) {
                if (chars[i] == chars[k]) {
                    counter++;
                    countedWord.put(chars[i], counter);
                }
            }
        }

        return countedWord;
    }
}
