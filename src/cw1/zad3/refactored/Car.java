package cw1.zad3.refactored;

public class Car implements CarEngine, CarManufacturer{

    private int maxSpeed;
    private String carName;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
