package com.joaco;

public class Main {


    public static void main(String[] args) {
        // Strings

        String number = String.valueOf(1);
        System.out.println(number);
        String format = String.format("Number %s", number);
        System.out.println(format);
        String[] names = {"Jamila", "Alex", "Joaquin"};
        String list = String.join(", ", names);     //Convertir un Array en String
        System.out.println(list);

    }




}

