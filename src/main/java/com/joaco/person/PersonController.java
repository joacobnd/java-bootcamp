package com.joaco.person;

import java.util.List;

//API Layer
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public List<Person> fetchAllPeopple() {
        return personService.getPeopple();
    }
}
