package com.company;

public class Mitsubishi extends Car{

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Fiat-> Vrummmhhh!!";
    }

    @Override
    public String accelerate() {
        return  "Fiat-> Start moving";
    }

    @Override
    public String brake() {
        return "Fiat-> is braking";
    }
}
