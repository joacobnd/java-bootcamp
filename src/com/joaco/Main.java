package com.joaco;

public class Main {

    public static void main(String[] args) {

        //Strings
        String amigos = "Amigos";
        String code = "code";
        String brand = amigos + code;
        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(0, 6).toUpperCase());
        System.out.println("  ".isEmpty());
        System.out.println("  ".isBlank());
        System.out.println("  a   ".trim());
    }
}