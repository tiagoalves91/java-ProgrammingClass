package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customer, double initial) {
        if (findCustomer(customer) == null) {
            customers.add(new Customer(customer, initial));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = new Customer(customerName,amount);
        if (findCustomer(customerName) != null) {
            customer.addTransactions(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(int i =0; i<customers.size();i++) {
            Customer customer = this.customers.get(i);

            if(customer.getName().equals(customerName)){
                return customer;
            }

        }
        return null;
    }

}
