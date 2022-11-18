package com.joaco;



public class Main {
    public static void main(String[] args) {

        //Polymorphism = many forms / muchas formas
            //Car - move - break - getCurrentSpeed
            //Bicycle - move - break - getCurrentSpeed
            //Electric Scooter - move - break - getCurrentSpeed
            //Vehicles

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car, bicycle, electricScooter};

        Person person = new Person("John", vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(10);
            System.out.println(vehicle.getCurrentSpeed());
            System.out.println();

        }

        System.out.println("purchase rate: " + Vehicle.PURCHASES_RATE);

        System.out.println(car.milesToKm());
    }



}



