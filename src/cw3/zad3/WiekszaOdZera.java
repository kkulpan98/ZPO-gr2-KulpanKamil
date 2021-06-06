package cw3.zad3;

import java.util.List;
import java.util.stream.Collectors;

public class WiekszaOdZera implements Dzialanie{

    @Override
    public void update(List<Integer> liczby) {
        System.out.println("Liczby większe od 0");
        System.out.println(liczby.stream().filter(e -> e > 0).collect(Collectors.toList()));
    }
}
