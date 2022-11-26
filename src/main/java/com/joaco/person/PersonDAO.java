package com.joaco.person;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

//DAO Layer
public class PersonDAO {
    private static List<Person> peopple;

    static {
        Faker faker = new Faker();
        peopple = new ArrayList<>();
        peopple.add(new Person(1, faker.name().fullName()));
        peopple.add(new Person(2, faker.name().fullName()));
    }

    public List<Person> getPeopple() {
        return peopple;
    }

}
