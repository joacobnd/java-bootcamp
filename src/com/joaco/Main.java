package com.joaco;



public class Main {

    public static void main(String[] args) {
        // || OR Logical Operators

        String gender = "FEMALe";
        if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) {   //one of the boolean could be true is no one is true then skip it
            System.out.println("Valid Gender");
        } else {
            System.out.println("Invalid gender");
        }

    }

}

