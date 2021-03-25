package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public BankAccount() {
        this("Bot", 1,500);
        System.out.println("im a constructor");
    }

    public BankAccount(String customerName, int accountNumber,double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("account Tiago created");
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(balance - amount < 0) {
            System.out.println("you have no funds");
            return;
        }
        this.balance -= amount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
