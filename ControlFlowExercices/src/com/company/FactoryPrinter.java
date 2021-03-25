package com.company;

public class FactoryPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        while (number > 1) {
            if (number % 3 == 0) {
                System.out.println(number);
                number++;
            }
        }
    }

}
