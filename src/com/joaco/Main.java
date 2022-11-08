package com.joaco;

public class Main {


    public static void main(String[] args) {
        // Strings
        String name1 = "Jamila";
        String name2 = "Jamila";
        String name3 = new String("Jamila");
        System.out.println(name1==name2);      // NUNCA USSAR == para comparar STRINGS
        System.out.println(name1==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));




    }




}

