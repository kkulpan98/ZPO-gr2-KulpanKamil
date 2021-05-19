package cw2.zad4;

public class Klient {
    private final SrodekPrzekazuStrategia srodekPrzekazuStrategia;
    private final TlumaczenieStrategia tlumaczenieStrategia;

    public Klient(SrodekPrzekazuStrategia srodekPrzekazuStrategia, TlumaczenieStrategia tlumaczenieStrategia) {
        this.srodekPrzekazuStrategia = srodekPrzekazuStrategia;
        this.tlumaczenieStrategia = tlumaczenieStrategia;
    }

    public void rozeslijReklame(TrescReklamy trescReklamy) {
        srodekPrzekazuStrategia.wyslij(tlumaczenieStrategia.tlumacz(trescReklamy));
    }
}
