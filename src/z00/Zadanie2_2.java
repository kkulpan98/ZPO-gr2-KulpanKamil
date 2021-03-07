package z00;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2_2 {

    public static void main(String[] args) {
        ArrayList<Double> wczytaneLiczby = Helper.wczytajdane(Scanner::nextDouble);

        System.out.println("Podwojona suma liczb dodatnich wynosi: " + wczytaneLiczby.stream().filter(integer -> integer > 0).collect(Helper.doubleAdditionCollector()) * 2);
    }
}
