package com.joaco.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("green"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        System.out.println(balls.contains(new Ball("yellow")));
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }

    record Ball(String color) {
    }

}
