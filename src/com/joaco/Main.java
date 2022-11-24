package com.joaco;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add("2");
        for (Object number : numbers) {
            System.out.println((String)number);
        }

//        Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//        at com.joaco.Main.main(Main.java:14)


    }


}



