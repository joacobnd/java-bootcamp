package com.joaco;


import java.time.*;

public class Main {


    public static void main(String[] args) {
        // Working With Dates
        LocalDate date = LocalDate.of(1992, 1, 22);

        LocalDateTime date2 = LocalDateTime.of(1992, 1, 22, 14, 55, 30);

        LocalTime date3 = LocalTime.of(22, 30);

        System.out.println(date);
        System.out.println(date3);
        System.out.println(date2);

    }




}

