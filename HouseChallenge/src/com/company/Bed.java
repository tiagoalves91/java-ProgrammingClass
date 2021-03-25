package com.company;

public class Bed {

    private int size;
    private String shape;
    private int pillows;

    public Bed(int size, String shape, int pillows) {
        this.size = size;
        this.shape = shape;
        this.pillows = pillows;
    }


    public void sleeping() {
        System.out.println("Sleeping time");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }
}
