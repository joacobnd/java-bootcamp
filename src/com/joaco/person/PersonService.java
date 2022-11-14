package com.joaco.person;

public class PersonService {

    public int addPerson(Person person) {
        if (person.getFirstName().isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        // store person to db
        return 1;
    }
}
