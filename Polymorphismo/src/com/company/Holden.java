package com.company;

public class Holden extends Car{

    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes-> Vrummmhhh!!";
    }

    @Override
    public String accelerate() {
        return  "Mercedes-> Start moving";
    }

    @Override
    public String brake() {
        return "Mercedes-> is braking";
    }
}
