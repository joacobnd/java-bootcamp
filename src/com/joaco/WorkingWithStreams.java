package com.joaco;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WorkingWithStreams {

    @Test
    void streams() {
        List<String> names = List.of("amigoscode", "alex", "zara");
        Stream<String> stream = names.stream();

        stream
                .limit(2).map(null).sorted(null).dropWhile(null)    //Intermediates
                .collect(Collectors.toList());                                                          // Terminal

        String[] namesArray = {};
        Arrays.stream(namesArray).map(null).limit(10) // No podemos usar namesArray.stream la forma correcta es Arrays.stream(nuestraArrayAqui)
                .collect(Collectors.toList());


    }
}
