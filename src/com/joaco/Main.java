package com.joaco;


public class Main {
    public static void main(String[] args) {
        // Break and Continue
        var names = new String[]{"Ali", "Andre", "Jamila", "Jones", "Matt", "Ahmed"};
        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
            }
        }


}

