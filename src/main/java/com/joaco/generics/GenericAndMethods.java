package com.joaco.generics;


public class GenericAndMethods {
    public static void main(String[] args) {


        String[] names = {"Joaquin", "Maxi"};
        Character[] letters = {'A', 'B', 'C'};
        Integer[] numbers = {1, 2, 3};
        //No podemos pasarle primitivos
//        char[] letters = {'A', 'B', 'C'};

        print(numbers);
        System.out.println();
        print(names);
        System.out.println();
        print(letters);


    }


    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
