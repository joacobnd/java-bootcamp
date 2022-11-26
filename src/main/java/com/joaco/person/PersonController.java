package com.joaco.person;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//API Layer
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public List<Person> fetchAllPeopple() {
        return personService.getPeopple();
    }
}
