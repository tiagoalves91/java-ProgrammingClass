package com.company;

public class Ferrari extends Car{

    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Im not my Father, Carlos Sainz");
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(100);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("Hello " + getName() + "i greet you master Corleone");    }
}
