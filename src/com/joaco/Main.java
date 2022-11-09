package com.joaco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {


    public static void main(String[] args) {
        // Working With Dates
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());
        System.out.println(localDate.toString());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
    }




}

