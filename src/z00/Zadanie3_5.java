package z00;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wygenerować?");
        Random random = new Random();

        int ileWygenerowac = scanner.nextInt();
        int dlugoscDodatniegoFragmentu = 0;
        int maxDlugoscDodatniegoFragmentu = 0;

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
                dlugoscDodatniegoFragmentu++;
                if(dlugoscDodatniegoFragmentu > maxDlugoscDodatniegoFragmentu){
                    maxDlugoscDodatniegoFragmentu = dlugoscDodatniegoFragmentu;
                }
            } else if (liczby[i] <= 0) {
                dlugoscDodatniegoFragmentu = 0;
            }
        }

        System.out.println(Arrays.toString(liczby));
        System.out.println("Dlugosc dodatniego fragmentu: " + maxDlugoscDodatniegoFragmentu);
    }
}
