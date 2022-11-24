package com.joaco;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Upper bounded Wildcards
        List<Double> list = Arrays.asList(1.9, 2.3, 3.4);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Number> list3 = Arrays.asList(20, 17, 39);
        printNumbers(list);
        System.out.println();
        printNumbers(list2);
        System.out.println();
        printNumbers(list3);

    }

    //al especificar que extiende de Numbers podemos utilizar cualquier clase hija que tenga
    static void printNumbers(List<? extends Number> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

}
