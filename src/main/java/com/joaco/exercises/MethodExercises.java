package com.joaco.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class MethodExercises {
    public static void main(String[] args) {
        sum(50, 15);
        System.out.println();
        negated(-10);
        System.out.println("");
        System.out.println("Exercise 3: ");
        System.out.println(checkEquals(20, 22));
        System.out.println("\nExercise 4: ");
        largerOrEqual(222,2);
        System.out.println("\nExercise 5:");
        firstCharUpperCase("joaquin");
        System.out.println("\nExercise 6:");
        String[] s = {"hola", "hello", "hallo", "hi"};
        numberOfItems(s);
        System.out.println("\nExcercise 7:");
        wordCounter("Hola me llamo joaquin y vivo en españa");
    }

    //    Exercise
    //    Write a method which takes two numbers as arguments and prints their sum to the termina
    public static void sum(int n1, int n2) {
        System.out.println("Exercise 1: " + n1 + n2);
    }

    /*
    Write a method which takes a number as an argument and returns that number negated,
    e.g. passing 5 as an argument should return -5; passing -10 should return 10.
     */
    public static void negated(int n1) {
        System.out.println("Exercise 2: " + n1 * -1);
    }

    /*
    Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.
    You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.
     */

    public static boolean checkEquals(int n1, int n2) {
        if (n1 == n2) {
            return true;
        } else return false;
    }

    /*
    Write a method which takes two numbers as arguments and prints one of:
        "The first number is larger"
        "The second number is larger"
        "The numbers are equal" as appropriate.
    */
    public static void largerOrEqual(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("The numbers are equals");
        } else if (n1 > n2) {
            System.out.println("The first number is larger");
        } else System.out.println("The second number is larger");
    }

    /*
    Write a method which takes a string as an argument, capitalizes the first letter
    and returns the capitalized string.
    HINT: The .toUpperCase() method will capitalize the whole string. Investigate how to
    split the first letter from the string, capitalize that, then join the pieces back together
     */
    public static void firstCharUpperCase(String s) {
        System.out.println(s.toUpperCase().charAt(0) + s.substring(1, s.length()).toLowerCase());
    }

    /*
        Write a method which takes an array of strings as an argument
        and returns the number of items in the array.
     */
    public static void numberOfItems(String[] sArray) {
        System.out.println(sArray.length);
    }

    /*
    Write a method which takes a sentence as an argument, counts the number
    of words in the array and prints "The sentence contains X words".
    HINT: Remember what you've done already, you might be able to reuse one of your methods here...
     */

    public static void wordCounter (String s) {
        StringTokenizer st = new StringTokenizer(s);
//        System.out.println(s.split("\\s+|\n|,").length);
        System.out.println(st.countTokens());

    }





}




