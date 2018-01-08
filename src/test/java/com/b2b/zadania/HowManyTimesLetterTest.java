package com.b2b.zadania;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class HowManyTimesLetterTest {
    HowManyTimesLetter letter = new HowManyTimesLetter();

    @Test
    public void howManyLettersOla() throws Exception {
        Map<Character, Integer> ola = letter.letterCounter("ola");
        Map<Character, Integer> expected = new TreeMap<Character, Integer>();
        expected.put('a', 1);
        expected.put('l', 1);
        expected.put('o', 1);

        assertEquals(expected, ola);
    }

    @Test
    public void howManyLettersArTwQssA() throws Exception {
        Map<Character, Integer> result = letter.letterCounter("ArTwQssA");
        Map<Character, Integer> expected = new TreeMap<Character, Integer>();
        expected.put('a', 2);
        expected.put('r', 1);
        expected.put('s', 2);
        expected.put('t', 1);
        expected.put('q', 1);
        expected.put('w', 1);

        assertEquals(expected, result);
    }

    @Test
    public void howManyLettersOOOllAAAA() throws Exception {
        Map<Character, Integer> result = letter.letterCounter("OOOllAAAA");
        Map<Character, Integer> expected = new TreeMap<Character, Integer>();
        expected.put('a', 4);
        expected.put('l', 2);
        expected.put('o', 3);

        assertEquals(expected, result);
    }

    @Test
    public void howManyLettersabcABCcbaaa() throws Exception {
        Map<Character, Integer> result = letter.letterCounter("abcABCcbaaa");
        Map<Character, Integer> expected = new TreeMap<Character, Integer>();
        expected.put('a', 5);
        expected.put('b', 3);
        expected.put('c', 3);

        assertEquals(expected, result);
    }

}