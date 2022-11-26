package com.joaco.person;


import java.util.List;

//Business Layer
public class PersonService {
    private PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<Person> getPeopple() {
        return personDAO.getPeopple();
    }

}
