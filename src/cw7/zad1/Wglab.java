package cw7.zad1;

import java.util.ArrayList;

public class Wglab implements Iterator {
    private ArrayList<Wezel> order = new ArrayList<>();
    private int position = 0;

    public Wglab(Wezel korzen) {
        order.add(korzen);
        ustalKolejnosc(korzen);
    }

    private void ustalKolejnosc(Wezel wezel) {
        for (Wezel jedenWezel : wezel.getDzieci()) {
            order.add(jedenWezel);
            if (wezel.getDzieci().size() > 0) {
                ustalKolejnosc(wezel);
            }
        }
    }

    public boolean hasNext() {
        return position < order.size();
    }

    public Wezel next() {
        return order.get(position++);
    }
}
