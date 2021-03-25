package com.company;

public class Car {

    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car-> Engine on";
    }

    public String accelerate () {
        return "Car-> car is moving";
    }

    public String brake() {
        return "Car-> car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

