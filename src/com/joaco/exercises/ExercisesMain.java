package com.joaco.exercises;


import java.util.Arrays;

public class ExercisesMain {

    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        // print the contents to the console
        System.out.println("Exercise 1:");
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

        // fill it with the number `4`
        // print the array to the console
        System.out.println();
        System.out.println("Exercise 2:");
        Arrays.fill(numbers, 4);
        System.out.println("Filling with number 4: " + Arrays.toString(numbers));


        // reassign the second value in the array to the number `17`
        // print the array to the console
        System.out.println();
        System.out.println("Exercise 3 - Reassigning the second value to the number 17:");
        numbers[1] = 17;
        System.out.println(Arrays.toString(numbers));

//        Exercise 4: What happens when you try to re assign index 5 to any integer?  - Throw an Exception index 5 is out of range
//        int[] numbers2 = {1, 2, 3, 4, 5};
//        numbers2[5] = 22;
//        System.out.println(Arrays.toString(numbers2));

        // Exercise 5
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        System.out.println();
        System.out.println("Exercise 5:");
        String[] letters = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(letters));

        //Exercise 6
        // using your answer to question above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare

        System.out.println();
        System.out.println("Exercise 6:");
        String[] letters2 = letters;
        letters2[0] = "z";
        System.out.println("Array 1: " + Arrays.toString(letters2));
        System.out.println("Array 2: " + Arrays.toString(letters));


        //Exercise 7
        // using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        System.out.println();
        System.out.println("Exercise 7:");
        String[] lettersCopy = Arrays.copyOf(letters, 4);
        lettersCopy[0] = "z";
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(lettersCopy));

        //Exercise 8
        // using your array from Q5, create a `for` loop which prints each item in the array
        System.out.println("");
        System.out.println("Exercise 8 - Creating a for to loop each item in the array:");
        for (String letter : letters) {
            System.out.println(letter);
        }

        //Exercise 9
        // create a for loop which goes from 0 to 10
        // print each value
        System.out.println("");
        System.out.println("Exercise 9:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Exercise 10
        // create a for loop which goes from 10 to 0
        // print each value
        System.out.println("");
        System.out.println("Exercise 10:");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        //Exercise 12
        //Create a loop that adds all numbers 0-10 to an array then prints the array
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array

        System.out.println();
        System.out.println("Exercise 12:");
        int[] array1 = new int[11];
        for (int i = 0; i <= 10 ; i++) {
            array1[i] = i;
        }
        System.out.println(Arrays.toString(array1));


        //Exercise 13
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
        System.out.println("");
        System.out.println("Exercise 13: ");
        int[] sumNumbers = {11, 13, 6, 20};
        int sum = 0;
        for (int i = 0; i < sumNumbers.length ; i++) {
            sum += sumNumbers[i];
        }
        System.out.println(sum);



    }

}

