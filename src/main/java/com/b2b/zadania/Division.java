package com.b2b.zadania;

public class Division {


    public String division(double no1, double no2) {
        String statement = "";
        if (no2 != 0) {
            double result = no1 / no2;
            double result2 = result * 100;
            double result3 = Math.round(result2);
            double result4 = result3/100;
            statement = "" + result4;
        } else {
            statement = "can't devide by zero!!";
        }
        return statement;
    }
}
