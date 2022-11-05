package com.joaco;



public class Main {

    public static void main(String[] args) {
        // && AND Logical Operators

        int age = 4;
        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("is adult :)");
        } else if (age == 0) {
            System.out.println("baby :)");
        } else if (age > 0 && age <=3) {                  //All boolean values need to be true if just one is false the code is skipped
            System.out.println("toddler :)");
        } else {
            System.out.println("is not adult :(");
        }


    }

}

