package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Porto");
        placesToVisit.add("Aveiro");
        placesToVisit.add("Braga");
        placesToVisit.add("S.Miguel");
        placesToVisit.add("Portimão");
        placesToVisit.add("Terceira");

        printList(placesToVisit);
        placesToVisit.add(1, "Melgaço");
        printList(placesToVisit);

        placesToVisit.remove(3);
        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("i wanna visit " + i.next());
        }
        System.out.println("//////////////////////////////////////////");
    }

    private static boolean addInOrder(LinkedList<String> linkList, String newCity) {
        ListIterator<String> stringListIterator = linkList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            // do not add
            if (comparison == 0) {
                System.out.println(newCity + "already on list");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("no cities in iteneray");
            return;
        } else {
            System.out.println("now visiting" + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holidays over ");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("now visiting" + listIterator.next());
                        break;
                    }
                case 2:
                    if (listIterator.hasNext()) {
                        System.out.println("now visiting" + listIterator.next());
                        break;
                    }
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("All Actions");
        System.out.println(
                "0 -> Quit \n " +
                "1-> new citie \n" +
                "2-> goingForward \n" +
                "3 -> showMenu");

    }
}


