package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int velocity;
    private int direction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.velocity = 0;
        this.direction = 0;
    }

    public void stop() {
        this.velocity = 0;
    }

    public void steer() {
this.direction += direction;
        System.out.println("Vehicle is steering");
    }

    public void moving(int velocity, int direction) {
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("im moving at " + velocity + "im going to " + direction);
    }
}
