package cw3.zad3;

import java.util.List;
import java.util.stream.Collectors;

public class PodzielnaPrzez2 implements Dzialanie {
    @Override
    public void update(List<Integer> liczby) {
        System.out.println("Liczby podzielne przez 2");
        System.out.println(liczby.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
    }
}
