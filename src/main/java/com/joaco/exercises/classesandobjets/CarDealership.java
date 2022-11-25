package com.joaco.exercises.classesandobjets;

import java.util.List;
import java.util.Objects;

public class CarDealership {

    String name;
    List<Car> displayCars;
    List<Car> carStock;

    public CarDealership(String name, List<Car> displayCars, List<Car> carStock) {
        this.name = name;
        this.displayCars = displayCars;
        this.carStock = carStock;
    }

    public CarDealership(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getDisplayCars() {
        return displayCars;
    }

    public void setDisplayCars(List<Car> displayCars) {
        this.displayCars = displayCars;
    }

    public List<Car> getCarStock() {
        return carStock;
    }

    public void setCarStock(List<Car> carStock) {
        this.carStock = carStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return Objects.equals(name, that.name) && Objects.equals(displayCars, that.displayCars) && Objects.equals(carStock, that.carStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayCars, carStock);
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", displayCars=" + displayCars +
                ", carStock=" + carStock +
                '}';
    }


    public int getAllCars() {
        return carStock.size() + displayCars.size();
    }

    public void addCarToDisplay(Car car) {
        displayCars.add(car);
    }

    public Car findCarByBrand(String brand) {
        String manufacturer;
        for (Car car : carStock) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                return car;
            }
        }
        return null;
    }

}
