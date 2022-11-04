package com.joaco;


import javax.swing.plaf.ComponentInputMapUIResource;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        //Exercise transoform amigoscode to Amigoscode
        String name = "amigoscode";
        String nameInUpperCase = name.toUpperCase().charAt(0) + name.substring(1, name.length()).toLowerCase();
        System.out.println(nameInUpperCase);



        //Exercise compare 2 strings
        System.out.println("Comparacion");
        String name1 = "Joaquin";
        String name2 = "joaquin";
        String name3 = "Maxi";
        Boolean result = name1.equals(name2);
        Boolean result2 = name1.equalsIgnoreCase(name2);

        System.out.println(result);
        System.out.println(result2);

    }

}

