package com.company;

import com.company.Bed;

public class Bedroom {

    private String door;
    private Bed bed;
    private Lamp lamp;
    private Wall wall;

    public Bedroom(String door, Bed bed, Lamp lamp, Wall wall) {
        this.door = door;
        this.bed = bed;
        this.lamp = lamp;
        this.wall = wall;
    }


    public void makebed() {
        System.out.println("Making Bed");
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}

