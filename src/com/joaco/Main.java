package com.joaco;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Working with files

        File file = createFile("src/foo.txt");
        writeFile(file, true);

    }

    private static void writeFile(File file, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);  //Si no queres que sobreescriba constantemente agregamos true
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Amigoscode");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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



