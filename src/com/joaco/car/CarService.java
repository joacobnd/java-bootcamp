package com.joaco.car;

public class CarService {

    private CarDAO carDAO = new CarDAO();
    public int registerNewCar(Car car) {
        // check if car is not null
        // check if regNumber is valid
        // check if regNumber is not taken
        // if price is < 0
        carDAO.addCar(car);
        return 1;
    }

    public Car[] getCars() {
       return carDAO.selectAllCars();
    }
}
