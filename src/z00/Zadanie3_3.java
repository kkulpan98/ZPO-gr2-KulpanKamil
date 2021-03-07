package z00;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wygenerować?");
        Random random = new Random();

        int ileWygenerowac = scanner.nextInt();
        int elementNajwiekszy;
        int iloscWystapien = 1;

        if (ileWygenerowac < 1 || ileWygenerowac > 100) {
            throw new IllegalArgumentException();
        }

        int[] liczby = new int[ileWygenerowac];

        for (int i = 0; i < ileWygenerowac; i++) {
//        while (!(liczby.contains(999) && liczby.contains(-999)))
            liczby[i] = random.nextInt(999 - (-999) + 1) + (-999);
        }

        elementNajwiekszy = liczby[0];

        for (int i = 0; i < ileWygenerowac; i++) {
            if (liczby[i] > elementNajwiekszy) {
                elementNajwiekszy = liczby[i];
                iloscWystapien = 1;
            } else {
                if (liczby[i] == elementNajwiekszy) {
                    iloscWystapien++;
                }
            }
        }

        System.out.println(Arrays.toString(liczby));
        System.out.println("Ilość najwiekszych elementow: " + iloscWystapien);
        System.out.println("Największy element: " + elementNajwiekszy);
    }
}
