package com.joaco.exercises.classesandobjets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        List<Car> displayCars = new ArrayList<Car>();

        Car toyota = new Car("TOYOTA", new BigDecimal(19000), EngineType.HYBRID);
        Car toyotaCorola = new Car("TOYOTA", new BigDecimal(25000), EngineType.HYBRID);
        Car vwGolf = new Car("VW", new BigDecimal(5000), EngineType.COMBUSTION);
        CarDealership corona = new CarDealership("Corona", displayCars, cars);
        corona.carStock.add(toyota);
        corona.carStock.add(vwGolf);
        corona.carStock.add(toyotaCorola);
        System.out.println(corona.getAllCars());
        System.out.println(corona);
        System.out.println(corona.findCarByBrand("toyota"));
    }



}
