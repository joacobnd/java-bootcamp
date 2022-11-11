package com.joaco;

public class Main {
    public static void main(String[] args) {
        //Classes

        Cat cat = new Cat("Felix", 5, "Blue");
        System.out.println(cat);
        Cat cat2 = new Cat("Felix", 5, "Blue");
        System.out.println(cat2);
        Cat cat3 = cat2;
        System.out.println(cat3);

        System.out.println(cat2 == cat3);
        System.out.println(cat2.equals(cat3));




    }



}



