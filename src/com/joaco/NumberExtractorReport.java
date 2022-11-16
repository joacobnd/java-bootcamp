package com.joaco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {
    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }
}
