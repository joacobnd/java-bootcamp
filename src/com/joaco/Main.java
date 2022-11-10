package com.joaco;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Working with files
        File file = new File("src/foo.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("File created successful!");
        }
    }


}



