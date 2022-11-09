package com.joaco;


import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        //Working with BigDecimal
        BigDecimal number = new BigDecimal("10.35");
        BigDecimal number2 = new BigDecimal("23.65");
//        BigDecimal result = number.add(number2);
        BigDecimal result = number2.subtract(number);
        System.out.println(result);

    }




}

