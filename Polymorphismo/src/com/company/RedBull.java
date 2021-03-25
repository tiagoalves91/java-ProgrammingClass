package com.company;

public class RedBull extends Car{

    public RedBull(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Max on command");
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(120);
        System.out.println("current speed " + speed);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("Hello " + getName() + "i greet you master Wings Bull");    }
}

