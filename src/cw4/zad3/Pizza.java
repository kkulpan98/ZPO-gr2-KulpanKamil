package cw4.zad3;

import java.util.ArrayList;

public abstract class Pizza {
    ArrayList<Skladnik> skladniki = new ArrayList<>();

    public void skladnikiPizzy() {
        for (Skladnik skladnik : skladniki) {
            skladnik.wypiszSkladnik();
        }
    }

    public void dodajSkladnik(ArrayList<Skladnik> skladniki) {
        this.skladniki.addAll(skladniki);
    }

}
