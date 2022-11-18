package com.joaco;

public class ElectricScooter implements Vehicle{

    private int currentSpeed;

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public ElectricScooter() {
    }

    @Override
    public void move(int amount) {
        System.out.println("hop on and press button");
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
