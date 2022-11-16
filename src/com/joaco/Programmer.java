package com.joaco;

public class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name,
                      int age,
                      String adress,
                      String experience) {
        super(name, age, adress, experience);

    }

    public Programmer(String name,
                      int age,
                      String adress,
                      String experience,
                      String[] programmingLanguages) {
        super(name, age, adress, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode() {
        System.out.println("Writing some code");
    }

}
