package com.joaco;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Classes
        Cat cat = new Cat();
        cat.name = "Felix";
        cat.meow();


    }

    static class Cat {
        String name;
        void meow() {
            System.out.println(name + ": meow..");
        }
    }

}



