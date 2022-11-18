package com.joaco;

public interface Vehicle {
    // Constants

    double PURCHASES_RATE = 0.5;


    // Abstracts methods
    void move(int amount);
    void applyBreak(int amount);
    int getCurrentSpeed();


    // default methods
}

