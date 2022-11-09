package com.joaco;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Exceptions
        try {
            int number = Integer.parseInt("1");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Failed to parse");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by Zero");
        }



    }




}

