package com.b2b.zadania;

public class DeltaFunkcjiKwadratowej {

    //Napisz program, który wyliczy deltę, podanej przez użytkownika funkcji f(x)=ax^2+bx+c.

    public double deltaFunkcjiKwadratowej(double a, double b, double c){
        // ax^2 + bx + c
        // delta = b^2 - 4ac

        double delta = Math.pow(b, 2.0) - 4*a*c;

        return delta;
    }
}
