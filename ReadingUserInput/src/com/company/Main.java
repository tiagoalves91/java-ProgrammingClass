package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countValidNumbers = 0;
        int sum = 0;

        while (countValidNumbers < 10) {
            System.out.println("Enter a number ?" + countValidNumbers);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                countValidNumbers++;
                sum += number;
                scanner.nextLine();

                if (countValidNumbers == 10) {
                    System.out.println("the result is " + sum);
                }
            } else {
                System.out.println("Invalid Number");
            }
        }
        scanner.close();
    }
}
