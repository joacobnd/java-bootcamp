package com.joaco;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"Java", "Go", "C++"};
        Programmer java = new Programmer("Jamal", 21, "London", "Full Stack", languages);


        java.writeSomeCode();
        System.out.println(java.getName());
        System.out.println(java.getAge());
        System.out.println(java.getAdress());
        System.out.println(java.getExperience());

    }

}



