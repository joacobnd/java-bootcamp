package com.joaco;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Waht's your age?");
        int age = scanner.nextInt();
        if (age < 15) {
            System.out.println("You are a child");
        } else System.out.println("Your are an adult");


        scanner.close();
    }




}

