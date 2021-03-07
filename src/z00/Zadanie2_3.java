package z00;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2_3 {

    public static void main(String[] args) {
        ArrayList<Double> wczytaneLiczby = Helper.wczytajdane(Scanner::nextDouble);

        System.out.println("Ilość dodatnich liczb: " + wczytaneLiczby.stream().filter(integer -> integer > 0).count());
        System.out.println("Ilość zer: " + wczytaneLiczby.stream().filter(integer -> integer == 0).count());
        System.out.println("Ilość ujemnych liczb: " + wczytaneLiczby.stream().filter(integer -> integer < 0).count());
    }
}
