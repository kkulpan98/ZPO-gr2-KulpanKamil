package cw1.zad4;

import java.util.ArrayList;

public class MiniSymulatorKaczek {

    public static void main(String[] args) {
        ArrayList<Kaczka> kaczki = new ArrayList<>();

        Kaczka gumowaKaczka = new Kaczka();
        gumowaKaczka.setSposobLatania(() -> System.out.println("UUAAAA ale prundkosc, naped rakietowy, pelna bajera"));
        gumowaKaczka.setSposobKwakania(() -> System.out.println("gumowe kwa kwa"));

        kaczki.add(gumowaKaczka);

        for (Kaczka kaczka : kaczki) {
            kaczka.kwacz();
            kaczka.lataj();
        }
    }
}
