package com.joaco;

public class Bicycle implements Vehicle {

    private int currentSpeed;

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Bicycle() {
    }

    @Override
    public void move(int amount) {
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreak(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
