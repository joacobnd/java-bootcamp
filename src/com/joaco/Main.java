package com.joaco;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //Polymorphism = many forms / muchas formas

        System.out.println(1 + 1); // 2
        System.out.println("1" + "1"); // 11


//        try {
//            NumberExtractorReport numberExtractorReport = new NumberExtractorReport();
//
//            numberExtractorReport.prepareAndSendReport("src/data.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println();

        NumberExtractorReport numberExtractorReport = new NumberExtractorReport();

        ExtractorReport reports = numberExtractorReport;

        try {
            reports.prepareAndSendReport("src/data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }



}



