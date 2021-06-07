package cw8.zad4;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
