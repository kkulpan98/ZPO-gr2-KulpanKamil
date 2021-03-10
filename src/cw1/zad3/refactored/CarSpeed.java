package cw1.zad3.refactored;

public class CarSpeed {
    public CarSpeed(Car car) {
        this.car = car;
    }

    public int getMaxSpeed(CarEngine carEngine) {
        return carEngine.getMaxSpeed();
    }

    public void showCarName() {
        System.out.println(car.getCarName());
    }

    private Car car;
}
