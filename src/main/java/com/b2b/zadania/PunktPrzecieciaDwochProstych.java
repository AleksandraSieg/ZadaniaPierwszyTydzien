package com.b2b.zadania;

import java.util.ArrayList;
import java.util.List;

public class PunktPrzecieciaDwochProstych {
    //21. Napisz program, który sprawdzi jakie parametry ma punkt przecięcia dwóch prostych: y=3x+80 i y=4x-35.

    public List<Double> punktPrzeciecia() {
        List<Double> punktPrzeciecia = new ArrayList<Double>();
        //x = (y+35) / 4
        //y = 3*((y+35)/4) + 80

        double y = 425.0;
        double x = (y + 35) / 4;

        punktPrzeciecia.add(x);
        punktPrzeciecia.add(y);

        return punktPrzeciecia;
    }
}
