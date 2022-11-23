package com.joaco;


import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> colorsUnmodified = List.of("blue", "yellor", "pink");

        colorsUnmodified.add("pink"); //we cant add more object cuz the list is immutable


        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        System.out.println("\nUsing for");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\nUsing foreach");
        colors.forEach(System.out::println);

        System.out.println("\nUsing fori");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }

}
