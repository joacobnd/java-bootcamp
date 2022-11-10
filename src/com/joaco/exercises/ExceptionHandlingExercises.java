package com.joaco.exercises;

import java.util.Arrays;

public class ExceptionHandlingExercises {
    public static void main(String[] args) {

        String[] test = {"22", "hola", "533", "22", "chau"};
        convert(test);
    }

    public static void convert(String[] str) {
        int[] listNumbers = new int[str.length];
        String[] notNumbers = new String[str.length];
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            try {
                if (str[i].matches("[+-]?\\d*(\\.\\d+)?")) {
                    listNumbers[i] = Integer.parseInt(str[i]);
                } else {
                    notNumbers[count] = str[i];
                    count++;
                }
            } catch (Exception e) {
                System.out.println("Failed to parse");
                e.printStackTrace();
            }
        }
        System.out.println("Numeros: " + Arrays.toString(listNumbers) + " and not numbers: " + Arrays.toString(notNumbers));
    }



}
