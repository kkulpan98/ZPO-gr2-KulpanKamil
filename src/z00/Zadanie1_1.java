package z00;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie1_1 {

    public static void main(String[] args) {
        ArrayList<Double> liczby = Helper.wczytajdane(Scanner::nextDouble);

        System.out.println("Podpunkt a: " + liczby.stream().collect(Helper.doubleAdditionCollector()));
        System.out.println("Podpunkt b: " + liczby.stream().collect(Helper.doubleMultiplicationCollector()));
        System.out.println("Podpunkt c: " + liczby.stream().map(Math::abs).collect(Helper.doubleAdditionCollector()));
        System.out.println("Podpunkt d: " + liczby.stream().map(aDouble -> Math.sqrt(Math.abs(aDouble))).collect(Helper.doubleAdditionCollector()));
        System.out.println("Podpunkt e: " + liczby.stream().map(Math::abs).collect(Helper.doubleMultiplicationCollector()));
        System.out.println("Podpunkt f: " + liczby.stream().map(aDouble -> Math.pow(aDouble, 2)).collect(Helper.doubleAdditionCollector()));
        System.out.println("Podpunkt g: " + liczby.stream().collect(Helper.doubleAdditionCollector()) + " oraz " + liczby.stream().collect(Helper.doubleMultiplicationCollector()));
        System.out.println("Podpunkt h: " + IntStream.range(0, liczby.size()).mapToObj(i -> Math.pow(-1, i + 2) * liczby.get(i)).collect(Helper.doubleAdditionCollector()));
        System.out.println("Podpunkt i: " + IntStream.range(0, liczby.size()).mapToObj(i -> (Math.pow(-1, i + 2) * liczby.get(i)) / Helper.silnia(liczby.get(i))).collect(Helper.doubleAdditionCollector()));
    }
}
