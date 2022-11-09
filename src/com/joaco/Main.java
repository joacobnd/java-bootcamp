package com.joaco;


import java.time.*;

public class Main {


    public static void main(String[] args) {
        // Working With Dates
        // EXERCISE: Write a method that calculate age on any given date

        System.out.println(ageCalculator(LocalDate.of(1992, 1, 22)));

    }

    public static int ageCalculator(LocalDate date) {
        int age = LocalDate.now().getYear() - date.getYear();
        return age;

    }



}

