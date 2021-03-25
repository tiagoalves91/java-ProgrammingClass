package com.company;

public class VipCustomer {


    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipCustomer() {
        this("bot", 1500,"botemail.com");
    }
    public VipCustomer(String name, String email){
       this(name,3000,email);

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
