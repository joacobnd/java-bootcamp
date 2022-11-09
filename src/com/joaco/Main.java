package com.joaco;



public class Main {
    public static void main(String[] args) {
        // Exceptions

        try {
            System.out.println(divide(10, 0));
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }

    }

    public static int divide(int a, int b) throws MyCheckedException{
        if (b == 0) {
            throw new MyCheckedException("Cannot divide by 0");
        }
        return a / b;
    }

//    public static int divide(int a, int b){
//        if (b == 0) {
//            throw new MyUncheckedException("Cannot divide by 0");
//        }
//        return a / b;
//    }

}



