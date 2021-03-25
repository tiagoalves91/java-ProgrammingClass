package com.company;

public class Wall {

    private double width;
    private double heigth;

    public Wall(double width, double heigth) {
        if((width< 0) || heigth<0) {
            this.width = 0;
            this.heigth = 0;
        }
        this.width = width;
        this.heigth = heigth;
    }

    public Wall() {
    }


    public double getArea() {
        return width * heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            this.width = 0;
        }
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        if(heigth<0){
            this.heigth = 0;
        }
        this.heigth = heigth;
    }
}
