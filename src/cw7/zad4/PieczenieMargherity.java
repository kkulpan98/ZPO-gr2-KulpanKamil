package cw7.zad4;

import java.util.ArrayList;

public class PieczenieMargherity extends Pieczenie {

    @Override
    void nagrzejPiec() {

    }

    @Override
    Pizza przygotujPizze() {
        Ciasto ciasto = new CienkieCiasto();
        ArrayList<Skladnik> skladniks = new ArrayList<>();

        skladniks.add(new Skladnik("Sos pomidorowy"));
        skladniks.add(new Skladnik("Ser mozarella"));
        skladniks.add(new Skladnik("Ser mozarella"));
        skladniks.add(new Skladnik("Bazylia"));
        skladniks.add(new Skladnik("Oliwa"));

        return new Pizza(ciasto, skladniks);
    }

    @Override
    Pizza wyjmijGotowaPizze(Pizza pizza) {
        return pizza;
    }
}
