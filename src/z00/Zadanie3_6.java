package z00;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wygenerować?");
        Random random = new Random();

        int ileWygenerowac = scanner.nextInt();

        if (ileWygenerowac < 1 || ileWygenerowac > 100) {
            throw new IllegalArgumentException();
        }

        int[] liczby = new int[ileWygenerowac];

        for (int i = 0; i < ileWygenerowac; i++) {
//        while (!(liczby.contains(999) && liczby.contains(-999)))
            liczby[i] = random.nextInt(999 - (-999) + 1) + (-999);
        }

        System.out.println(Arrays.toString(liczby));

        for (int i = 0; i < ileWygenerowac; i++) {
            if (liczby[i] > 0) {
                liczby[i] = 1;
            } else if (liczby[i] < 0) {
                liczby[i] = -1;
            }
        }

        System.out.println("Tablica po zmianie");
        System.out.println(Arrays.toString(liczby));
    }
}
