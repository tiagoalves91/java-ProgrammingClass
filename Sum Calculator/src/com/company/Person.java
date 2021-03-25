package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFullName() {
        if((firstName.isEmpty() && lastName.isEmpty())) {
            return "";
        } else if (firstName.isEmpty()){
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName +" "+ lastName;
    }

    public boolean isTeen() {
        if (age>=12 && age<=20) {
            return true;
        }
        return false;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
