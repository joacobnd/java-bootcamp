package com.joaco;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Joaquin"));
        map.put(2, new Person("Ali"));
        map.put(3, new Person("Mariam"));
        map.put(3, new Person("Mariam")); //la key es unica y no se puede duplicar
        map.put(4, new Person("Adrian"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.remove(4);

        map.entrySet().forEach(x -> System.out.println(x));  //loop
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(4, new Person("default")));  //si la key es null crea el objeto que pasamos como 2do parametro
        System.out.println(map.values());
    }

    record Person(String name) {
    }

}
