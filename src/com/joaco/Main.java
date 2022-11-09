package com.joaco;


import java.time.*;

public class Main {


    public static void main(String[] args) {
        // Working With Dates
        LocalDateTime nowSpain = LocalDateTime.now(ZoneId.of("Europe/Madrid"));
        LocalDateTime nowArg = LocalDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));

        System.out.println(nowSpain);
        System.out.println(nowArg);

        ZoneId.getAvailableZoneIds();

        for (String zones : ZoneId.getAvailableZoneIds()) {
            System.out.println(zones);
        }



    }




}

