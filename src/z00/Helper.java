package z00;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;

public class Helper {

    public static <T> ArrayList<T> wczytajdane(Function<Scanner, T> function) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile wczytać liczb?");

        ArrayList<T> wpisaneLiczby = new ArrayList<>();
        int ileWczytac = scanner.nextInt();

        if (ileWczytac < 1) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < ileWczytac; i++) {
            wpisaneLiczby.add(function.apply(scanner));
        }

        return wpisaneLiczby;
    }

    public static double silnia(double n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        double output = 1;
        for (int i = 2; i <= n; i++) {
            output *= i;
        }
        return output;
    }

    public static Collector<Double, double[], Double> doubleMultiplicationCollector() {
        return Collector.of(
                () -> new double[]{1.0d},
                (result, item) -> result[0] *= item,
                (result1, result2) -> {
                    result1[0] *= result2[0];
                    return result1;
                },
                total -> total[0]
        ); // TODO: set proper characteristics
    }

    public static Collector<Double, double[], Double> doubleAdditionCollector() {
        return Collector.of(
                () -> new double[1],
                (result, item) -> result[0] += item,
                (result1, result2) -> {
                    result1[0] += result2[0];
                    return result1;
                },
                total -> total[0]
        ); // TODO: set proper characteristics
    }

}
