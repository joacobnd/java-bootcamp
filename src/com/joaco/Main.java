package com.joaco;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Exceptions
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();  //Print the StackTrace (Red message error)
        } catch (Exception e) {
            //Catch all exceptions
            System.out.println(e.getMessage());
        }



    }




}

