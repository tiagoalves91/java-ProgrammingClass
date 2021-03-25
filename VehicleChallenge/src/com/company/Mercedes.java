package com.company;

public class Mercedes extends Car {

    private int roadService;

    public Mercedes(int roadService) {
        super("Mercedes", "4x", 5, 5, 7, true);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {

        int newSpeed = getVelocity() + rate;

        if (newSpeed == 0) {
            stop();
        } else if (newSpeed > 0 && newSpeed < 10) {
            setCurrentGear(1);
        } else if (newSpeed > 11 && newSpeed < 30) {
            setCurrentGear(2);
        } else if (newSpeed > 30 && newSpeed < 50) {
            setCurrentGear(3);
        } else {
            setCurrentGear(4);
        }

    }

}

