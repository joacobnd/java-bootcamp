package com.joaco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    public abstract String clean(String input);

    private String parse(String path) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "Empty file";
        }

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();
            if (matches) {
                out += clean(nextLine) + "\n";
            }

        }
        return out.isBlank() ? "Empty file" : out;
    }

    public void prepareAndSendReport(String patch) throws FileNotFoundException {
        System.out.println("Starting report " + getReportName() + "...");
        String report = parse(patch);
        System.out.println(report);
        System.out.println("sent report " + getReportName());
    }

}
