package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("Wooden", "black");

        Bed bed = new Bed(30,"circle",2);

        Lamp lamp = new Lamp("led",true, 80);

        Bedroom bedroom = new Bedroom("modern",bed,lamp,wall1);

        bedroom.makebed();
        bed.sleeping();
    }
}
