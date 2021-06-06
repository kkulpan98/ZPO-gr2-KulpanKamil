package cw6.zad1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PLik implements Dane {

    private int n;

    public PLik(int n) {
        this.n = n;
    }

    @Override
    public int[] odczytaj() {
        ArrayList<Integer> liczby = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader("./plik.txt"));
            while (scanner.hasNextInt()) {
                liczby.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return liczby.stream().mapToInt(Integer::intValue).toArray();
    }
}
