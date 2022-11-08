package com.joaco;


import java.awt.*;

public class Main {
    public static final String NAME = "Alex";

    public static void main(String[] args) {
        // Final Keyword
        final var name = "Alex";               // Usually we have to use FINAL when we want to create a constant
        //name = "Jamila";                     // is no longer possible to change it when initially the var is "final"
        final Point p = new Point();
        p.x=10;
        p.y=20;
        System.out.println(p);
        System.out.println(NAME);

    }


}

