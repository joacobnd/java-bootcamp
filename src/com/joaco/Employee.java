package com.joaco;

import java.util.Objects;

public class Employee {

    protected String name;
    protected int age;
    protected String adress;
    protected String experience;

    public Employee(String name,
                    int age,
                    String adress,
                    String experience) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.experience = experience;
    }

    public void sayHi() {
        System.out.println("Hello my name is " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(adress, employee.adress) && Objects.equals(experience, employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, adress, experience);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
