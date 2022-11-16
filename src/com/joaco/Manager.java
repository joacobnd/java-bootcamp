package com.joaco;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name,
                   int age,
                   String adress,
                   String experience) {
        super(name, age, adress, experience);
    }

    public void report() {
        System.out.println("Manager team report");
    }
}
