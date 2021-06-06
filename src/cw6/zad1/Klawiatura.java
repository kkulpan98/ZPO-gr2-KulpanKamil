package cw6.zad1;

import java.util.Scanner;

public class Klawiatura implements Dane {

    private int n;

    public Klawiatura(int n) {
        this.n = n;
    }

    @Override
    public int[] odczytaj() {
        int[] liczby = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextInt();
        }
        return liczby;
    }
}
