package cw7.zad1;

import java.util.ArrayList;
import java.util.List;

public class Wezel {
    private List<Wezel> dzieci = new ArrayList<>();
    private Integer liczba = null;

    public void dodajDziecko(Wezel dziecko) {
        this.dzieci.add(dziecko);
    }

    public Integer getLiczba() {
        return liczba;
    }

    public List<Wezel> getDzieci() {
        return dzieci;
    }

    public void setDzieci(List<Wezel> dzieci) {
        this.dzieci = dzieci;
    }
}