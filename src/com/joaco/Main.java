package com.joaco;


public class Main {
    public static void main(String[] args) {
        // Break and Continue
        var numbers = new int[]{1, 2, 3, 4, 5, 6};
        for (int number : numbers) {
            if (number == 3) {
                break;
            }
            System.out.println(number);
        }
    }


}

