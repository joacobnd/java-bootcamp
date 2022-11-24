package com.joaco;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comparable number = 10;
        number.compareTo("10"); //trying to compare with a String


//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at java.base/java.lang.Integer.compareTo(Integer.java:71)
//        at com.joaco.Main.main(Main.java:11)



    }


}



