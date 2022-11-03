package com.joaco;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Arrays

        int[] numbers = new int[5];
        numbers[0] = 22;
        numbers[1] = 6;
        numbers[2] = 88;
        numbers[3] = 56;
        numbers[4] = 30;
        System.out.println("Array 1: " + Arrays.toString(numbers));
        System.out.println(numbers.length);

        System.out.println();

        int[] numbers2 = {12, 22, 9, 13, 90, 54, 113};
        System.out.println("Array 2: " + Arrays.toString(numbers2));
        System.out.println(numbers2.length);


        String[] names = {"Jamila", "Alex"};
        System.out.println(Arrays.toString(names));


    }

}

