package com.joaco;

public interface Vehicle {
    // Constants


    // Abstracts methods
    void move(int amount);
    void applyBreak(int amount);
    int getCurrentSpeed();


    // default methods
}

