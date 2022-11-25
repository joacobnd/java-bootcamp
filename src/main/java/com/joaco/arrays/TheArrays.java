package com.joaco.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";
        System.out.println("\nUsing Arrays.toString():");
        System.out.println(Arrays.toString(colors));
        System.out.println("\nUsing sout(color[1]) index by index:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        System.out.println("\nUsing for:");

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("\nUsing for invert");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println("\nUsing Arrays.stream(colors).forEach(System.out::println)");
        Arrays.stream(colors).forEach(System.out::println);


    }
}
