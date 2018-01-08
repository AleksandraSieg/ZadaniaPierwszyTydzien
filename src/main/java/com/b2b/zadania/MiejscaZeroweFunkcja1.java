package com.b2b.zadania;

public class MiejscaZeroweFunkcja1 {

    //24. Znajdź miejsca zerowe funkcji y=34x^2+7x-30.
    private double a = 34;
    private double b = 7;
    private double c = -30;

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
