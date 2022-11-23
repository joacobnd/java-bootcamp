package com.joaco.solid;


import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String brand = "Joaquin";
        Optional<String> brandOptional = Optional.ofNullable(brand);
        String ifBrandEmpty = brandOptional.orElse("The brand is empty");

        brandOptional.ifPresentOrElse(s -> System.out.println(s.toUpperCase()), () -> System.out.println(ifBrandEmpty));

        goUpperCase(Optional.empty());



    }

    public static void goUpperCase(Optional<String> input) {
        input.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
}
