package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Player player = new Player("Tiago",50,20);
        System.out.println(player.toString());
        player.setWeapon("Machine-Gun");
        saveObject(player);
        loadObject(player);
        System.out.println(player);

        ISaveable eren = new Monster("Eren", 20,40);
        System.out.println(eren);
        saveObject(eren);
    }

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;

        System.out.println("Choose \n" +
                            "1 Enter a String\n" +
                            "0 to quit");


        while(!quit) {
            System.out.println("choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 :
                    quit= true;
                    break;
                case 1 :
                    System.out.println("Enter a String");
                    String input = scanner.nextLine();
                    values.add(index,input);
                    index++;
                    break;

            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i=0; i< objectToSave.write().size(); i++) {
            System.out.println("Saving" + objectToSave.write().get(i) + "storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}




