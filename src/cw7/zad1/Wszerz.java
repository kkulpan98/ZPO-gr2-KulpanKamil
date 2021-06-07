package cw7.zad1;

import java.util.ArrayList;
import java.util.List;

public class Wszerz implements Iterator{
    ArrayList<Wezel> order = new ArrayList<>();
    int position = 0;

    public Wszerz(Wezel korzen) {
        order.add(korzen);
        ustalKolejnosc(korzen);
    }

    private void ustalKolejnosc(Wezel korzen) {
        order.addAll(korzen.getDzieci());
        for (Wezel jedenWezel: korzen.getDzieci()) {
            if(jedenWezel.getDzieci().size() > 0){
                ustalKolejnosc(jedenWezel);
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
