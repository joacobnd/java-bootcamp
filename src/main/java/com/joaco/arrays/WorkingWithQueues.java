package com.joaco.arrays;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.function.Predicate;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Joaquin", 20));
        linkedList.add(new Person("Alexa", 30));
        linkedList.addFirst(new Person("Maxi", 35));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
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
