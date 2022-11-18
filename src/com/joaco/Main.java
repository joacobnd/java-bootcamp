package com.joaco;


import com.joaco.car.CarDAO;
import com.joaco.car.CarService;
import com.joaco.email.EmailService;

public class Main {
    public static void main(String[] args) {

        // dependencies
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService(emailService);

        // inject
        CarService carService = new CarService(carDAO, emailService, motService);

    }


}



