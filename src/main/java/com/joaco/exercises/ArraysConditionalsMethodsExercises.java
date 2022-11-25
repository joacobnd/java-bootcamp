package com.joaco.exercises;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysConditionalsMethodsExercises {
    public static void main(String[] args) {

        reverseMethod("Hola estamos probando invertir un String!");
        String[] words = {"hello", "ola", "bye", "hello","joaquin", "ciao"};
        //String a = getLongerString(words);
        getLongerString(words);


    /*
    Given the following String input
    String input = "   amig os cod e  "
    Write a program that transforms input into: Amigoscode
    */
//        String brand = "   amig os cod e  ";
//        String noSpacesBrand = brand.replace(" ", "");
//        System.out.println(noSpacesBrand.toUpperCase().charAt(0) + noSpacesBrand.substring(1, noSpacesBrand.length()).toLowerCase());


    }

    /*
    Write a method that reverses any String and print to console
    Input should be a string
    Output should be reversed input
    */
    public static void reverseMethod(String s) {
        String sReverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sReverse += s.charAt(i);
        }
        System.out.println(sReverse);
    }

    /*
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static void getLongerString(String[] s) {
        String longest = Arrays.toString(s);
        String longestWord = Arrays.stream(longest.split(", ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
        System.out.println(longestWord);

    }



}
