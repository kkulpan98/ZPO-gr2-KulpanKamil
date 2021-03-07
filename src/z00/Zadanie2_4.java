package z00;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2_4 {

    public static void main(String[] args) {
        ArrayList<Double> wczytaneLiczby = Helper.wczytajdane(Scanner::nextDouble);

        System.out.println("Min: " + wczytaneLiczby.stream().min(Double::compareTo));
        System.out.println("Max: " + wczytaneLiczby.stream().max(Double::compareTo));
    }
}
