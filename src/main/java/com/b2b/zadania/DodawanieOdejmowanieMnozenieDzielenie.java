package com.b2b.zadania;

public class DodawanieOdejmowanieMnozenieDzielenie {
    //15. Napisz program, który wyświetli wynik:
    // dodawania, odejmowania, mnożenia, dzielenia dwóch liczb podanych przez użytkownika.

    public double dodawanie(double liczba1, double liczba2) {
        double suma = liczba1 + liczba2;
        return suma;
    }

    public double odejmowanie(double liczba1, double liczba2) {
        double roznica = liczba1 - liczba2;
        return roznica;
    }

    public double mnozenie(double liczba1, double liczba2) {
        double iloczyn = liczba1 * liczba2;
        return iloczyn;
    }

    public String dzielenie(double liczba1, double liczba2) {
        String ilorazS = "";

        if (liczba2 != 0) {
            double iloraz = liczba1 / liczba2;
            Math.round(iloraz);
            ilorazS = ilorazS + iloraz;
        } else {
            ilorazS = "Nie dziel cholero przez zero";
        }
        return ilorazS;
    }
}
