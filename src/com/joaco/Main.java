package com.joaco;

public class Main {
    public static void main(String[] args) {
        //Classes

        Cat cat = new Cat();
        cat.setName("Felix");
        System.out.println(cat.getName());
        cat.meow();

        System.out.println("");

        Cat cat2 = new Cat();
        cat2.setName("Rose");
        System.out.println(cat2.getName());
        cat2.meow();
    }



}



