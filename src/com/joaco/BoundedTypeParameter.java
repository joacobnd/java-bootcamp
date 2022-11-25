package com.joaco;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {30, 20, 10, 2, 8, 33};
        Double[] numbers2 = {20.0, 10.0, 2.0};
        System.out.println(countGreaterThan(numbers, 20));
        System.out.println(countGreaterThan(numbers2, 15.5));

    }

    interface A {}

    interface B {}

    // Solo podemos extender UNA clase y debe ir PRIMERO luego las interfaces
    // No podemos usar Lowers and Uppers
    public static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
