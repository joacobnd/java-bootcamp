package com.joaco.exercises;

import java.io.*;
import java.util.Scanner;

public class FilesExercise {
    public static void main(String[] args) {

        File file = new File("src/data.csv");
        loadData(file, false);


        try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();   //Skip the first line "ID, FIRST_NAME ETC"  LAST EXERCISE
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void loadData(File file, Boolean append) {
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            writer.println("""
                        id,first_name,last_name,email,gender
                        1,Fanchette,Williamson,fwilliamson0@github.com,F
                        2,Aleksandr,Matts,amatts1@webs.com,M
                        3,Maurie,Cordero,mcordero2@google.co.jp,M
                        4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                        5,Ricardo,Gofton,rgofton4@nytimes.com,M
                        6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                        7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                        8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                        9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                        10,Reider,Karel,rkarel9@github.io,M
                        11,Dory,Jolliff,djolliffa@wufoo.com,F
                        12,Homerus,Averay,haverayb@skyrock.com,M
                        13,Alyda,Muglestone,amuglestonec@is.gd,F
                        14,Pinchas,Louca,ploucad@google.es,M
                        15,Cherin,Eltringham,celtringhame@parallels.com,F
                        16,Mufi,Rothert,mrothertf@dropbox.com,F
                        17,Jordana,Everex,jeverexg@ucla.edu,F
                        18,Belle,Rother,brotherh@auda.org.au,F
                        19,Clevie,Sifflett,csiffletti@furl.net,M
                        20,Gretchen,Abell,gabellj@1688.com,F
                    """);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
