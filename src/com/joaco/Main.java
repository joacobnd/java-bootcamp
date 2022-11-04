package com.joaco;



public class Main {

    public static void main(String[] args) {
        // Loops and Arrays
        String[] names = {"James", "Nadia", "Sophia", "Alex", "Saleh", "Aisha"};

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        System.out.println("");
        for (String name : names) {
            System.out.println(name);
        }


//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);


    }

}

