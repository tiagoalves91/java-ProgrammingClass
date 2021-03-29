package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("Carolina ",150.00 );
	Customer anotherCustomer;

	anotherCustomer = customer;
	anotherCustomer.setBalance(250.00);

	System.out.println("Name for customer:" + customer.getName() + "is balance is " + customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(3);

		for (int i=0; i<intList.size();i++) {
			System.out.println(i + ": " + intList.get(i));
		};

		intList.add(1,2);

		for (int i=0; i<intList.size();i++) {
			System.out.println(i + ": " + intList.get(i));
		};

		LinkedList<String> placesToVisit = new LinkedList<>();

	}

}
