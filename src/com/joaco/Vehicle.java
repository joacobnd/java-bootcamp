package com.joaco;

public interface Vehicle {
    // Constants
    double PURCHASES_RATE = 0.5;


    // Abstracts methods
    void move(int amount);

    void applyBreak(int amount);

    int getCurrentSpeed();


    // default methods
    default double milesToKm() {                     //cualquier clase que implemente esta interfaz puede usar el metodo sin necesidad de implementarlo en su clase
        return getCurrentSpeed() * 1.609;
    }






}

