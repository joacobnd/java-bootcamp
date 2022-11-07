package com.joaco;


public class Main {

    /*
        -Access Modifier
        -Optional static
        -Return type
        -Name
        -Optional Parameters
        -Method Body
        -Optional return value
     */


    private static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    private static void printBrand(String brand) {
        System.out.println(brand.toUpperCase());
    }

    public static void main(String[] args) {

        System.out.println(add(25, 25));
        printBrand("Joaco");

    }

}

