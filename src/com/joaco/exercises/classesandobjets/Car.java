package com.joaco.exercises.classesandobjets;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private String brand;
    private BigDecimal price;
    private EngineType engyneType;

    public Car(String brand, BigDecimal price, EngineType engyneType) {
        this.brand = brand;
        this.price = price;
        this.engyneType = engyneType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public EngineType getEngyneType() {
        return engyneType;
    }

    public void setEngyneType(EngineType engyneType) {
        this.engyneType = engyneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(price, car.price) && Objects.equals(engyneType, car.engyneType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, engyneType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", engyneType='" + engyneType + '\'' +
                '}';
    }
}
