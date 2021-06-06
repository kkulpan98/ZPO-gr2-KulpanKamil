package cw3.zad3;

import java.util.ArrayList;
import java.util.List;

public class Wczytywanie {
    private final List<Integer> liczby = new ArrayList<>();
    private final List<Dzialanie> dzialania = new ArrayList<>();

    public void addObserver(Dzialanie dzialanie) {
        this.dzialania.add(dzialanie);
    }

    public void removeObserver(Dzialanie dzialanie) {
        this.dzialania.remove(dzialanie);
    }

    public void notifyObservers() {
        for (Dzialanie dzialanie : this.dzialania) {
            dzialanie.update(this.liczby);
        }
    }

    public void addLiczbe(Integer liczby) {
        this.liczby.add(liczby);
    }
}
