package com.joaco;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        Queue<Person> supermarketqueue = new LinkedList<>();
        supermarketqueue.add(new Person("Joaquin", 20));
        supermarketqueue.add(new Person("Alex", 21));
        supermarketqueue.add(new Person("Marian", 48));
        supermarketqueue.add(new Person("Ali", 50));

        System.out.println(supermarketqueue.size());
        System.out.println(supermarketqueue.peek());
        System.out.println(supermarketqueue.poll());  //Muestra el primero en la queue y lo borrra (como .pop() con los stack)
        System.out.println(supermarketqueue.peek());
        System.out.println(supermarketqueue.size());
    }

    static record Person(String name, int age) {
    }

}
