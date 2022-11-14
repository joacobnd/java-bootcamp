package com.joaco;

import com.joaco.car.Car;
import com.joaco.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

import static java.lang.Math.*;         // STATIC IMPORT

public class Main {
    public static void main(String[] args) {

        // Packages
        // Domain / Model   -- Don't contain business logic inside
        // Service Classes -> business logic
        // Data Access Object Classes
        // Utility Classes
        // Configuration

        carsExample();


    }

    private static void carsExample() {
        Car car = new Car("TOYOTA", new BigDecimal(10_000));

        CarService carService = new CarService();

        carService.registerNewCar(car);

        System.out.println(Arrays.toString(carService.getCars()));
    }


}



