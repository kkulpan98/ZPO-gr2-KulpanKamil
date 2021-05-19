package cw2.zad3;

public class Postac {

    private WybierzBronStrategia wybierzBronStrategia;

    public void wybierzStrategie(WybierzBronStrategia wybierzBronStrategia) {
        this.wybierzBronStrategia = wybierzBronStrategia;
    }

    public void wybierzBron() {
        wybierzBronStrategia.wybierzBron();
    }
}
