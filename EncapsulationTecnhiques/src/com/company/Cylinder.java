package com.company;

public class Cylinder extends Circle{

    public double getHeigth() {
        return heigth;
    }

    private double heigth;

    public Cylinder(double radius, double heigth) {
        super(radius);
        if(heigth < 0) {
            this.heigth = 0;
        }
        this.heigth = heigth;
    }

    public double getVolume(){
       return getArea() * heigth;
    }

}
