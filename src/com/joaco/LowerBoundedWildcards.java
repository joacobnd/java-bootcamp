package com.joaco;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Lower bounded Wildcards
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Number> list3 = Arrays.asList(20, 17, 39);
        System.out.println();
        printNumbers(list2);
        System.out.println();
        printNumbers(list3);

    }
    // Al contrario que Upper Bounded
    //al usar SUPER estamos diciendo que puede usar la clase que indicamos + las superclases de estas (las clases que extiende) en este caso Integer la cual es Number
    static void printNumbers(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

}
