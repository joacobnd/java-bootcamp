package com.joaco.person;


import com.joaco.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    public static int count;

    static {
        System.out.println("Start: static initialization.");
        System.out.println("End: static initialization.");
        count=0;                       //static block initialization block
    }
    private String firstName;
    private int age;
    private Car[] cars;



    public Person(String firstName, int age, Car[] cars) {
        this.firstName = firstName;
        this.age = age;
        this.cars = cars;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Arrays.equals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, age);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
