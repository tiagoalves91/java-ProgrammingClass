package com.company;

public class Car {

    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;
    private int velocity;

    public Car( String name,int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
        this.velocity = 0;
    }

    public void welcomeMessage() {
        System.out.println("Welcome aboard " + name + " lets race");
    }

    public void startEngine() {
        System.out.println("ignition on at Car");
    }

    public void accelerate(int speed) {
        velocity += speed;
    }

    public void brake() {
        this.velocity = 0 ;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
