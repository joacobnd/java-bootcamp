package com.joaco;



public class Main {

    public static void main(String[] args) {
        // switch
        char grade = 'A';

//        switch (grade) {
//            case 'A':
//                System.out.println("Excellent!");
//                break;
//            case 'B':
//            case 'C':
//                System.out.println("Pass!");
//                break;
//            default:
//                System.out.println("Fail!");
//        }

        String result = switch (grade) {
            case 'A' -> "Excellent!";
            case 'B' -> "Pass!";
            case 'C' -> "Pass!";
            default -> "Fail!";
        };

        System.out.println(result.toUpperCase());


    }

}

