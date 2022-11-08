package com.joaco;


public class Main {
    public static void main(String[] args) {
        // Break and Continue
        var names = new String[]{"Joaquin", "Ali", "Andre", "Jamila", "Jones", "Matt", "Ahmed"};
        for (String name : names) {
            if (name.startsWith("A")) {
                return;
            }
            System.out.println(name);


        }

        System.out.println("End of the main method");

    }


}

