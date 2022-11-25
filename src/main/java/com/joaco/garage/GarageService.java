package com.joaco.garage;

import com.joaco.car.Car;

public class GarageService {

    public boolean addCarToGarage(Car car, Garage garage) {

        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }

        int count = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                count++;
            }
        }
        if (count >= garage.getCapacity()) {
            return false;
        }
        // add car to garage
        return true;
    }
}
