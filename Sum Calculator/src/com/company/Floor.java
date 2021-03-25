package com.company;

public class Floor {

    private double width;
    private double length;


    public Floor(double width, double heigth) {
        if(heigth<0 || width<0) {
            this.length =0;
            this.width = 0;
        }
        this.width = width;
        this.length = heigth;
    }

    public double getArea() {
        return width * length;
    }
}
