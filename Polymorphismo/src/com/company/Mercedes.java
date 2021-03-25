package com.company;

public class Mercedes extends Car{
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Hamilton on board!! Mercedes popping up");    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(150);
        System.out.println("current speed " + speed);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("Hello " + getName() + "i greet you master German Something");    }
}

