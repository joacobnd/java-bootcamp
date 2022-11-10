package com.joaco;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Working with files

        File file = createFile("src/foo.txt");
        writeFile(file, true);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeFile(File file, boolean append) {
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            writer.println("Bianca");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


//        try {
//            FileWriter fileWriter = new FileWriter(file, append);  //Si no queres que sobreescriba constantemente agregamos true
//            PrintWriter writer = new PrintWriter(fileWriter);
//            writer.println("Amigoscode");
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }

    private static File createFile(String path) {

        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }


}



