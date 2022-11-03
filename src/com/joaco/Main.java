package com.joaco;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Pass by Value with objects
        Point pointA = new Point(10, 10);
        Point pointB = pointA;

        // En memory stack la referencia para ambos point es la misma, por ende la info que se guarda dentro del Heap es la misma para ambos(Comparten la misma info).

        pointB.x = 100;
        System.out.println(pointA);
        System.out.println(pointB);

        // al usar new point ahora si estamos creando en la memory stack un frame nuevo con una referencia en el heap(Ya no comparten la misma info).
        pointB = new Point(55, 55);
    }

}
