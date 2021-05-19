package cw7.zad4;

import java.util.ArrayList;

public class PieczenieSycylijskiej extends Pieczenie {

    @Override
    void nagrzejPiec() {

    }

    @Override
    Pizza przygotujPizze() {
        Ciasto ciasto = new GrubeCiasto();
        ArrayList<Skladnik> skladniks = new ArrayList<>();

        skladniks.add(new Skladnik("Sos pomidorowy"));
        skladniks.add(new Skladnik("Oliwki"));
        skladniks.add(new Skladnik("Kapary"));
        skladniks.add(new Skladnik("Przyprawy"));

        return new Pizza(ciasto, skladniks);
    }

    @Override
    Pizza wyjmijGotowaPizze(Pizza pizza) {
        return pizza;
    }
}
