package com.joaco;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            new EmailExtractorReport().prepareAndSendReport("src/data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}



