package com.b2b.zadania;

public class PointLyingOnTheStraightLine {
    //19. Napisz program, który sprawdzi czy punkt podany przez użtykownika, leży na prostej y=3x+40.

    public boolean pointOnAStraightLine(int x, int y) {

        boolean result = false;
        if (y == x * 3 + 40) {
            result = true;
        }

        return result;
    }
}
