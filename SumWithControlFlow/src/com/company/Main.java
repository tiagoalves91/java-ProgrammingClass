package com.company;

public class Main {

    public static void main(String[] args) {
        sum3And5();
    }

    public static int sum3And5() {
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                counter++;
                System.out.println(sum);
            }
                if (counter == 5) {
                    break;
                }
        }
        return sum;
    }
}
