package com.joaco;

public class Main {
    public static void main(String[] args) {
        //Classes

        Cat cat = new Cat("Felix", 5, "Blue");
        System.out.println(cat);
        Cat cat2 = new Cat("Felix", 5, "Blue");
        System.out.println(cat2);


        System.out.println(cat == cat2);   //bad
        System.out.println(cat.equals(cat2));  //hay que usar equals para objects




    }



}



