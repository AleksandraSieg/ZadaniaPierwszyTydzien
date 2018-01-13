package com.b2b.zadania;

public class AdditionDeductionMultiplicationDivision {
    //15. Napisz program, który wyświetli wynik:
    // dodawania, odejmowania, mnożenia, dzielenia dwóch liczb podanych przez użytkownika.

    public double addition(double no1, double no2) {
        double sum = no1 + no2;
        return sum;
    }

    public double deduction(double no1, double no2) {
        double difference = no1 - no2;
        return difference;
    }

    public double multiplication(double no1, double no2) {
        double ratio = no1 * no2;
        return ratio;
    }

    public String division(double no1, double no2) {
        String quotientString = "";

        if (no2 != 0) {
            double quotient = no1 / no2;
            Math.round(quotient);
            quotientString = quotientString + quotient;
        } else {
            quotientString = "Do not divide by zero!";
        }
        return quotientString;
    }
}
