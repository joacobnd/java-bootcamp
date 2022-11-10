package com.joaco;

public class Cat {
    private String name;
    private int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }

    public Cat() {

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {

        System.out.println(name + ": meow..");
    }

}
