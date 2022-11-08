package com.joaco;

public class Main {

    //Global Variable
    private static final String BRAND = "Amigoscode";  //Podemos usar esta variable en cualquier lugar de esta clase
    public static final double PI = 3.14;             //Podemos usar esta variable en cualquier clase y cualquier paquete
    public static void main(String[] args) {
        //Local Variable
        String country = "España";   //Solo se puede dentro del metodo main de esta clase
        String BRAND = "Adidas";
        System.out.println(BRAND);
        System.out.println(Main.BRAND);

    }

    public static void foo() {
//        System.out.println(country);        //No podemos usar la variable local country por que es local
        System.out.println(BRAND);
    }


}

