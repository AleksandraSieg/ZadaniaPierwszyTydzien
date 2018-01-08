package com.b2b.zadania;

public class PunktLezacyNaProstej {

    public boolean punktLezacyNaProstej(int x, int y) {
        //19. Napisz program, który sprawdzi czy punkt podany przez użtykownika, leży na prostej y=3x+40.
        boolean wynik = false;
        if (y == x * 3 + 40) {
            wynik = true;
        }

        return wynik;
    }
}
