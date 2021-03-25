package com.company;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = getNumbers(5);
        int [] sorted = sortNumbers(numbers);

        printArray(sorted);
     //   printArray(numbers);
    }


    public static int[] getNumbers(int number) {
        int[] inputValues = new int[number];
        System.out.println("enter your number \r");

        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
        }
        return inputValues;
    }

    public static void printArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("you choose the number " + numbers[i]);
        }
    }

    public static int[] sortNumbers(int[] numbers) {
        int[] aux = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            aux[i] = numbers[i];
        }
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < aux.length - 1; i++) {
                if (aux[i] < aux[i + 1]) {
                    temp = aux[i];
                    aux[i] = aux[i + 1];
                    aux[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return aux;
    }
}
