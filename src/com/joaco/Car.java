package com.joaco;

public class Car implements Vehicle{

    private int currentSpeed;

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Car() {
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
