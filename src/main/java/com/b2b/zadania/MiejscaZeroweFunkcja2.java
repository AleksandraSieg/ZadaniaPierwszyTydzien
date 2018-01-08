package com.b2b.zadania;

public class MiejscaZeroweFunkcja2 {

    //23. Znajdź miejsca zerowe funkcji y=2x^2-4x+60.
    private double a = 2;
    private double b = -4;
    private double c = 60;

    public double delta() {
        double delta = Math.pow(b, 2.0) - 4 * a * c;
        return delta;
    }

    public double pierwszeMiejsceZerowe() {
        double x = (-b + Math.sqrt(delta())) / 2 * a;
        return x;
    }

    public double drugieMiejsceZerowe() {
        double x = (-b - Math.sqrt(delta())) / 2 * a;
        return x;
    }
}
