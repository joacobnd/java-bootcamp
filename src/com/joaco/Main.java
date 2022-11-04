package com.joaco;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Arrays null values
        int[] numbers = new int[3];
        Arrays.fill(numbers, -1);  //Rellena la array con el valor que indiquemos
        numbers[2] = 27;
        System.out.println(Arrays.toString(numbers));


        String[] names = new String[3];
        Arrays.fill(names, "foo");
        names[1] = "Jamila";
        System.out.println(Arrays.toString(names));

    }

}

