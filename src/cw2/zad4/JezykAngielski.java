package cw2.zad4;

public class JezykAngielski implements TlumaczenieStrategia {
    @Override
    public String tlumacz(TrescReklamy trescReklamy) {
        switch (trescReklamy) {
            case GRZEBIEN_DLA_JEZA:
                return "kup grzebien dla jeza po angielsku";
            case KUP_BUTY_W_BIEDRZE:
                return "kup buty w biedrze po angielsku";
            case KUP_MARCHEWKE_W_LIDELKU:
                return "kup marchewke w lidelku po angielsku";
            default:
                throw new IllegalArgumentException("ALE NIE MA TAKIEGO TLUMACZENIA");
        }
    }
}
