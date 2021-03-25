package com.company;

public class Carpet {

    public double getCost() {
        return cost;
    }

    private double cost;

    public Carpet(double cost) {
        if(cost<0) {
            this.cost = 0;
        }
        this.cost = cost;
    }
}
