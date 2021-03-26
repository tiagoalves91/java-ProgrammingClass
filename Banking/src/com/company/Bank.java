package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCostumer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer added" + customerName);
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        if(branchName != null) {
            return new Branch(branchName);
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double transaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName,transaction);
            }
            return false;
        }
    }


