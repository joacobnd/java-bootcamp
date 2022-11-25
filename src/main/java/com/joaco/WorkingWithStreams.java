package com.joaco;

import com.joaco.person.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WorkingWithStreams {

    @Test
    public void streams() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joaquin", 30));
        people.add(new Person("Alex", 13));
        people.add(new Person("Maria", 16));
        people.add(new Person("Nico", 20));
        people.add(new Person("Hector", 19));
        people.add(new Person("Maxi", 18));
        people.add(new Person("Ani", 15));
        people.add(new Person("Jessica", 24));
        people.add(new Person("Laura", 33));
        people.add(new Person("Laura", 13));

        List<Person> peopleLessAndEqualThan18 = people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Declarative");
        peopleLessAndEqualThan18.forEach(System.out::println);
    }

    @Test
    public void imperative() {
        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Joaquin", 30));
        people2.add(new Person("Alex", 13));
        people2.add(new Person("Maria", 16));
        people2.add(new Person("Nico", 20));
        people2.add(new Person("Hector", 19));
        people2.add(new Person("Maxi", 18));
        people2.add(new Person("Ani", 15));
        people2.add(new Person("Jessica", 24));
        people2.add(new Person("Laura", 33));
        people2.add(new Person("Laura", 13));
        List<Person> list = new ArrayList<>();

        int limit = 10;
        int count = 0;
        for (Person person : people2) {
            if (person.getAge() <= 18) {
                list.add(person);
                count++;
                if (count == limit) {
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Imperative:");
        list.forEach(System.out::println);
    }
}
