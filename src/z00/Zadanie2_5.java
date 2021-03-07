package z00;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double poprzednik, nastepnik;
        int iloscTakichLiczb = 0;
        ArrayList<Double[]> paryLiczb = new ArrayList<>();

        System.out.println("Ile wczytać liczb?");

        int ileWczytac = scanner.nextInt();

        if (ileWczytac < 1) {
            throw new IllegalArgumentException();
        }

        poprzednik = scanner.nextDouble();

        for (int i = 1; i < ileWczytac; i++) {
            nastepnik = scanner.nextDouble();

            if (nastepnik > 0 && poprzednik > 0) {
                iloscTakichLiczb++;
                paryLiczb.add(new Double[]{poprzednik, nastepnik});
            }
            poprzednik = nastepnik;
        }

        System.out.println("Ilość takich par to: " + iloscTakichLiczb);
        for (Double[] element: paryLiczb) {
            System.out.println(element[0] + ", " + element[1]);
        }
    }
}
