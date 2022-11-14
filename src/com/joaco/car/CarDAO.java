package com.joaco.car;

public class CarDAO {
    private static Car[] cars;
    private static int nextAvailableSlot = 0;
    private static final int CAPACITY = 100;

    static {
        cars = new Car[CAPACITY];
    }

    public void addCar(Car car) {
        if (nextAvailableSlot + 1 >= CAPACITY) {
            // grow db
        }
        cars[nextAvailableSlot] = car;
        ++nextAvailableSlot;

    }
}
