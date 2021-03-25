package com.company;

import java.util.Scanner;

public class Main {
        private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter how many counts");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int min = findMin(returnedArray);
        System.out.println("the min is " + min);

    }

    private static int [] readIntegers(int count) {
        int [] array = new int [count];

        for(int i =0; i<count; i++) {
        System.out.println("enter your number? ");
        int number = scanner.nextInt();
        scanner.nextLine();
        array[i] = number;
        }
        return array;
    }

    private static int findMin (int [] array) {
        int min = Integer.MAX_VALUE;

        for (int i =0 ; i<array.length;i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
