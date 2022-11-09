package com.joaco;



public class Main {


    public static void main(String[] args) {
        // Exceptions

        //La mejor forma es usar throws en los metodos y quien llame al metodo se encargue de manejar la exception como el quiera
        try {
            anna();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static void anna() throws Exception {
        jamila();
    }
    static void jamila() throws Exception {
            john();
    }

    static void john() throws Exception{
            divide(10, 0);
    }
    public static double divide(int a, int b) throws Exception{
        if (b == 0) {
            throw new Exception("Cannot divide by 0");
        }
        return a / b;
    }




}

