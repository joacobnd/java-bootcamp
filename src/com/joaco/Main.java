package com.joaco;


import java.math.BigDecimal;
import java.time.*;

public class Main {


    public static void main(String[] args) {
        //The Problem With double
        double number1 = 0.02;
        double number2 = 0.03;
        double result = number2 - number1;
        System.out.println(result);

        BigDecimal number3 = new BigDecimal("0.02");
        BigDecimal number4 = new BigDecimal("0.03");
        BigDecimal subResult = number4.subtract(number3);
        System.out.println(subResult);
    }




}

