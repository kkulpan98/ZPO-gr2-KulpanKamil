package z00;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wygenerować?");
        Random random = new Random();

        int ileWygenerowac = scanner.nextInt();
        int iloscNieparzystych = 0;
        int iloscParzystych = 0;

        if (ileWygenerowac < 1 || ileWygenerowac > 100) {
            throw new IllegalArgumentException();
        }

        int[] liczby = new int[ileWygenerowac];

        for(int i = 0; i < ileWygenerowac; i++){
//        while (!(liczby.contains(999) && liczby.contains(-999)))
            liczby[i] = random.nextInt(999 - (-999) + 1) + (-999);
        }

        for (int i = 0; i < ileWygenerowac; i++) {
            if(liczby[i] % 2 == 0){
                iloscParzystych++;
            } else {
                iloscNieparzystych++;
            }
        }

        System.out.println(Arrays.toString(liczby));
        System.out.println("Ilość nieparzystych elementów: " + iloscNieparzystych);
        System.out.println("Ilość parzystych elementów: " + iloscParzystych);
    }
}
