package z00;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wygenerować?");
        Random random = new Random();

        int ileWygenerowac = scanner.nextInt();
        int sumaDodatnich = 0;
        int sumaUjemnych = 0;

        if (ileWygenerowac < 1 || ileWygenerowac > 100) {
            throw new IllegalArgumentException();
        }

        int[] liczby = new int[ileWygenerowac];

        for (int i = 0; i < ileWygenerowac; i++) {
//        while (!(liczby.contains(999) && liczby.contains(-999)))
            liczby[i] = random.nextInt(999 - (-999) + 1) + (-999);
        }

        for (int i = 0; i < ileWygenerowac; i++) {
            if (liczby[i] > 0) {
                sumaDodatnich += liczby[i];
            } else if (liczby[i] < 0) {
                sumaUjemnych += liczby[i];
            }
        }

        System.out.println(Arrays.toString(liczby));
        System.out.println("Suma dodatnich elementów: " + sumaDodatnich);
        System.out.println("Suma ujemnych elementów: " + sumaUjemnych);
    }
}
