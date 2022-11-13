package com.joaco;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("foobar st", "NE3340", "England");
        Car tesla = new Car(CarBrand.TESLA, new BigDecimal("65000"));
        Car[] cars = {tesla};

        Person alex = new Person("Alex", 22, address, cars);

        System.out.println(alex);

    }



}



