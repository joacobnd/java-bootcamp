package com.joaco;



public class Main {

    public static void main(String[] args) {
        // switch
        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass!");
                break;
            default:
                System.out.println("Fail!");
        }

    }

}

