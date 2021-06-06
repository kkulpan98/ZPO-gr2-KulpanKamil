package cw3.zad3;

import java.util.List;
import java.util.stream.Collectors;

public class RownaTrzy implements Dzialanie {
    @Override
    public void update(List<Integer> liczby) {
        System.out.println("Liczby równe 3");
        System.out.println(liczby.stream().filter(e -> e == 3).collect(Collectors.toList()));
    }
}
