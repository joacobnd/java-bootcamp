package com.joaco.solid;

public class Square implements Shape{

    private int length;

    public Square(int length) {
        this.length = length;
    }



    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}
