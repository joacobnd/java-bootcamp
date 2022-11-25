package com.joaco.exercises;

public class EnumsExercises {
    public static void main(String[] args) {


        for (TShirtSize sizes : TShirtSize.values()) {
            System.out.println(sizes.toString().toLowerCase());
        }
    }
}
