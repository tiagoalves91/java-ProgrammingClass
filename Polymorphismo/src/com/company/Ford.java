package com.company;

public class Ford extends Car{

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota-> Vrummmhhh!!";
    }

    @Override
    public String accelerate() {
        return  "Toyota-> Start moving";
    }

    @Override
    public String brake() {
        return "Toyota-> is braking";
    }
}
