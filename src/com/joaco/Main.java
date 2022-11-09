package com.joaco;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Exceptions
        try {
            File file = new File("src/foo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }




}

