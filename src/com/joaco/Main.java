package com.joaco;



public class Main {

    public static void main(String[] args) {
        // Type Casting - Convert one data type to another
        // Implicit Type (Widening) Casting
        int balance = 10_000;
        double doubleBalance = balance;
        System.out.println(balance);
        System.out.println(doubleBalance);

        // Explicit Type (Narrowing) Casting
        double doublePrice = 123.50;
        int price = (int) doublePrice;  // Casteamos a int pero vamos a perder informacion
        System.out.println(doublePrice);
        System.out.println(price);


    }


}

