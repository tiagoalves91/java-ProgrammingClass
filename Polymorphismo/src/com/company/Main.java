package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i<10; i++) {
            Car car = getCar();
            System.out.println("Car was " + car.getName());
            car.welcomeMessage();

        }

    }

    public static Car getCar() {
        int randomNumber = (int) (Math.random()*3)+1;
        System.out.println("random number was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Mercedes("Mercedes",12);
            case 2:
                return new RedBull("RedBull",8);
            case 3:
                return new Ferrari("Ferrari", 8);
        }
        return null;
    }
}
