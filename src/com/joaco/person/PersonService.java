package com.joaco.person;

import com.joaco.utils.StringUtils;


public class PersonService {

    public int addPerson(Person person) {
        if (StringUtils.isEmpty(person.getFirstName())) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        // store person to db
        return 1;
    }
}
