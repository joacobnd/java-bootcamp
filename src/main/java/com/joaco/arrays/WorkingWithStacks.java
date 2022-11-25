package com.joaco.arrays;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); //agregamos elemento
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); //muestra el ultimo elemento
        System.out.println(stack.size()); //muestra el tamaño
        System.out.println(stack.pop()); //muestra y elimina el ultimo elemento
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
