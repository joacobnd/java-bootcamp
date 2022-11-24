package com.joaco;



public class Main {
    public static void main(String[] args) {
        Box box = new Box<>();
        box.set(new Phone(""));
        System.out.println(box.get());

        Box box2 = new Box<>();
        box.set(new Letter("Joaquin"));
        System.out.println(box.get());


    }

}

