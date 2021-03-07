package z00;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną");

        ArrayList<Double> wpisaneLiczby = new ArrayList<>();
        int ileWczytac = scanner.nextInt();

        if (ileWczytac < 1) {
            throw new IllegalArgumentException();
        }

        double pierwszaLiczba = scanner.nextDouble();

        for (int i = 1; i < ileWczytac; i++) {
            wpisaneLiczby.add(scanner.nextDouble());
        }

        for (Double aDouble : wpisaneLiczby) {
            System.out.print(aDouble + ", ");
        }

        System.out.println(pierwszaLiczba);
    }
}
