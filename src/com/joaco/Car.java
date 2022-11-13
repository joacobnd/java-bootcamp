package com.joaco;

import java.io.Serializable;
import java.math.BigDecimal;

public class Car implements Serializable {


    private String regNumber;
    private BigDecimal price;

    public Car() {
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
