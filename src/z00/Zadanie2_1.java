package z00;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie2_1 {

    public static void main(String[] args) {
        ArrayList<Integer> wczytaneLiczby = Helper.wczytajdane(Scanner::nextInt);

        System.out.println("Podpunkt a: " + wczytaneLiczby.stream().filter(integer -> integer % 2 != 0).count());
        System.out.println("Podpunkt b: " + wczytaneLiczby.stream().filter(integer -> integer % 3 == 0 && integer % 5 != 0).count());
        System.out.println("Podpunkt c: " + wczytaneLiczby.stream().filter(integer -> Math.sqrt(integer) % 2 == 0).count());
        System.out.println("Podpunkt d: " + wczytaneLiczby.stream().filter(integer -> integer % 3 == 0 && integer % 5 != 0).count());
//        System.out.println("Podpunkt e: " + IntStream.range(0, wczytaneLiczby.size()).mapToObj(i -> (Math.pow(-1, i + 2) * liczby.get(i)) / Helper.silnia(liczby.get(i))).collect(doubleAdditionCollector()));
        System.out.println("Podpunkt f: " + IntStream.range(0, wczytaneLiczby.size()).filter(i -> i % 2 != 0 && wczytaneLiczby.get(i) % 2 == 0).mapToObj(wczytaneLiczby::get).count());
        System.out.println("Podpunkt g: " + wczytaneLiczby.stream().filter(integer -> integer % 2 != 0 && integer > 0).count());
        System.out.println("Podpunkt h: " + IntStream.range(0, wczytaneLiczby.size()).filter(i -> Math.abs(wczytaneLiczby.get(i)) < i * i).mapToObj(wczytaneLiczby::get).count());
    }
}
