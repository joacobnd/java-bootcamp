package com.joaco.solid;


public class Main {

    public static void main(String[] args) {
        String brand = "Amigoscode";
        System.out.println(brand.toUpperCase());
//        Cat rose = new Cat(null);
        Cat rose = new Cat("Rosie");
        System.out.println(rose.toString());
//        rose = null;
        System.out.println(rose.getName().toString());

    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
