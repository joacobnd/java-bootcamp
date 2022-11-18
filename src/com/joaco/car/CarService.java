package com.joaco.car;

import com.joaco.MOTService;
import com.joaco.email.EmailService;

public class CarService {

    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

    public CarService(CarDAO carDAO, EmailService emailService, MOTService motService) {
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
    }

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
