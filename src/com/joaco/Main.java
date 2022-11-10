package com.joaco;

public class Main {
    public static void main(String[] args) {
        //Classes

        Cat cat = new Cat("Felix", 5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.meow();

        System.out.println("");

        Cat cat2 = new Cat("Rose", 7);
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());
        cat2.meow();

        System.out.println("");

        Cat cat3 = new Cat();
        cat3.setName("Sima");
        cat3.setAge(2);
        System.out.println(cat3.getName());
        System.out.println(cat3.getAge());
        cat3.meow();
    }



}



