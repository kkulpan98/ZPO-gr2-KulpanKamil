package z00;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {

    private static int[][] wygenerujMacierz(int x, int y) {
        Random random = new Random();

        int[][] output = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                output[i][j] = random.nextInt(10);
            }
        }

        return output;
    }

    private static void wypiszMacierz(int[][] macierz) {
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] pomnozMacierz(int[][] macierz1, int[][] macierz2){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, k;

        System.out.println("Podaj m");
        m = scanner.nextInt();
        if (m < 0 || m > 10) {
            throw new IllegalArgumentException();
        }

        System.out.println("Podaj n");
        n = scanner.nextInt();
        if (n < 0 || n > 10) {
            throw new IllegalArgumentException();
        }

        System.out.println("Podaj k");
        k = scanner.nextInt();
        if (k < 0 || k > 10) {
            throw new IllegalArgumentException();
        }

        int[][] macierz1 = wygenerujMacierz(m, n);
        int[][] macierz2 = wygenerujMacierz(n, k);

    }
}
