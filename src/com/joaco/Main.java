package com.joaco;



public class Main {
    public static void main(String[] args) {





    }

    //solution
    public static void rentalYield(double monthlyRent, double originalPropertyPrice) {
        double anualRent = monthlyRent*12;
        double rentalYield = anualRent / originalPropertyPrice * 100;
        System.out.println(Math.round(rentalYield * 100.00) / 100.00);
    }
}

