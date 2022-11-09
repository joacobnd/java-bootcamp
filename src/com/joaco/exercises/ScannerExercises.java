package com.joaco.exercises;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exercise 1:
        System.out.println("Exercise 1:");
        System.out.println("Ingrese un numero");
        int number = scanner.nextInt();
        isEvenOrOdd(number);
        if (isEvenOrOdd(number)) {
            System.out.println("El numbero es par");
        } else System.out.println("El numero es impar");

        //Exercise 2:
        System.out.println("\nExercise 2:");
        System.out.println("Ingrese un numero:");
        isPrime(scanner.nextInt());

    }

    //Exercise 1
    public static boolean isEvenOrOdd(int n) {
        return n % 2 == 0;
    }

    //Exercise 2
    public static void isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("El numero es primo");
        } else System.out.println("El numero no es primo");
    }

    //Exercise 3
//    public static void jokerGenerator() {
//        String[]
//    }
}
