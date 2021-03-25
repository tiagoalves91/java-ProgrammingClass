package com.company;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManuel;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManuel = isManuel;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car changed gear " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        moving(speed, direction);
        System.out.println("im going at a " + speed + " and going to " + direction);
    }

}
