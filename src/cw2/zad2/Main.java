package cw2.zad2;

public class Main {
    public static void main(String[] args) {
        KodowanieDzwiekuStrategia strategia;

        strategia = new DolbyProLogic();
        strategia.zagraj();

        strategia = new DolbyDigital();
        strategia.zagraj();
    }
}
