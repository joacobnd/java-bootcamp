package com.joaco.exercises;


import java.util.Arrays;
import java.util.Objects;

public class ExercisesMain {

    public static void main(String[] args) {
//        // declare an empty integer array of length = 3
//        // print the contents to the console
//        System.out.println("Exercise 1:");
//        int[] numbers = new int[3];
//        System.out.println(Arrays.toString(numbers));
//
//        // fill it with the number `4`
//        // print the array to the console
//        System.out.println();
//        System.out.println("Exercise 2:");
//        Arrays.fill(numbers, 4);
//        System.out.println("Filling with number 4: " + Arrays.toString(numbers));
//
//
//        // reassign the second value in the array to the number `17`
//        // print the array to the console
//        System.out.println();
//        System.out.println("Exercise 3 - Reassigning the second value to the number 17:");
//        numbers[1] = 17;
//        System.out.println(Arrays.toString(numbers));
//
////        Exercise 4: What happens when you try to re assign index 5 to any integer?  - Throw an Exception index 5 is out of range
////        int[] numbers2 = {1, 2, 3, 4, 5};
////        numbers2[5] = 22;
////        System.out.println(Arrays.toString(numbers2));
//
//        // Exercise 5
//        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
//        // print the array to the console
//        System.out.println();
//        System.out.println("Exercise 5:");
//        String[] letters = {"a", "b", "c", "d"};
//        System.out.println(Arrays.toString(letters));
//
//        //Exercise 6
//        // using your answer to question above, create a second array which is initialized using your original array
//        // hint: instead of using the `new` keyword, try simply giving the name of your original array
//        // change the value at index 0 of the new array to "z"
//        // print both of your arrays and compare
//
//        System.out.println();
//        System.out.println("Exercise 6:");
//        String[] letters2 = letters;
//        letters2[0] = "z";
//        System.out.println("Array 1: " + Arrays.toString(letters2));
//        System.out.println("Array 2: " + Arrays.toString(letters));
//
//
//        //Exercise 7
//        // using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
//        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
//        // change the value at index 0 of the new array to "z"
//        // print both of the arrays and compare
//
//        System.out.println();
//        System.out.println("Exercise 7:");
//        String[] lettersCopy = Arrays.copyOf(letters, 4);
//        lettersCopy[0] = "z";
//        System.out.println(Arrays.toString(letters));
//        System.out.println(Arrays.toString(lettersCopy));
//
//        //Exercise 8
//        // using your array from Q5, create a `for` loop which prints each item in the array
//        System.out.println("");
//        System.out.println("Exercise 8 - Creating a for to loop each item in the array:");
//        for (String letter : letters) {
//            System.out.println(letter);
//        }
//
//        //Exercise 9
//        // create a for loop which goes from 0 to 10
//        // print each value
//        System.out.println("");
//        System.out.println("Exercise 9:");
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        //Exercise 10
//        // create a for loop which goes from 10 to 0
//        // print each value
//        System.out.println("");
//        System.out.println("Exercise 10:");
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }
//
//        //Exercise 12
//        //Create a loop that adds all numbers 0-10 to an array then prints the array
//        // create an array. Remember to manually set the size
//        // create a for loop which goes from 0 to 10, adding each value to an array
//        // print our array
//
//        System.out.println();
//        System.out.println("Exercise 12:");
//        int[] array1 = new int[11];
//        for (int i = 0; i <= 10 ; i++) {
//            array1[i] = i;
//        }
//        System.out.println(Arrays.toString(array1));
//
//
//        //Exercise 13
//        // create an array of n numbers
//        // create a sum variable
//        // create a loop
//        // add each item to the sum value
//        // outside the loop print the total sum
//        System.out.println("");
//        System.out.println("Exercise 13: ");
//        int[] sumNumbers = {11, 13, 6, 20};
//        int sum = 0;
//        for (int i = 0; i < sumNumbers.length ; i++) {
//            sum += sumNumbers[i];
//        }
//        System.out.println(sum);
//
//        //Exercise 14
//        // create a for loop which goes through each string in our array
//        // make each word uppercase
//        // assign the value in the array to the uppercase string
//        // print our resulting array
//
//        System.out.println("");
//        System.out.println("Exercise 14: ");
//        String[] exercise14 = {"i", "sure", "do", "love", "bees"};
//        String[] resolveExercise14 = new String[exercise14.length];
//        for (int i = 0; i < exercise14.length; i++) {
//            resolveExercise14[i] = exercise14[i].toUpperCase();
//        }
//
//        for (String s : resolveExercise14) {
//            System.out.println(s);
//        }
//
//
//        //Exercise 15
//        // create a for loop which goes through each string in our array
//        // grab the first letter of our word
//        // capitalise the first letter
//        // add the capitalised letter to the rest of the provided word
//        // assign the value to an array
//        // print our resulting array
//
//        System.out.println("");
//        System.out.println("Exercise 15: ");
//        String[] exercise15 = {"i", "sure", "do", "love", "bees"};
//        String[] resolveExercise15 = new String[exercise15.length];
//        for (int i = 0; i < exercise15.length; i++) {
//            resolveExercise15[i] = exercise15[i].toUpperCase().charAt(0) + exercise15[i].substring(1, exercise15[i].length()).toLowerCase();
//        }
//
//        for (String s : resolveExercise15) {
//            System.out.println(s);
//        }
//
//        //Exercise 16
//        // create a for loop which goes through number in our array
//        // check whether the value is greater than the current greatest value
//        // reassign the current greatest value if true
//        // print the greatest value
//
//        System.out.println("");
//        System.out.println("Exercise 16: ");
//        int[] exercise16 = {1, 6, 54, 17, 9, 20, 5};
//        int numMax = 0;
//        for (int i : exercise16) {
//            if (i > numMax) {
//                numMax = i;
//            }
//        }
//        System.out.println(numMax);
//
//        //Exercise 17
////        Write a program that reverses an array of Strings
////        String[] content = {"you", "are", "how", "hello"}
////        Tip. Use for loop and you to start at highest index.
////        Output should be: hello how are you?. Note question mark at the end
//        System.out.println();
//        System.out.println("Exercise 17: ");
//        String[] exercise17 = {"you", "are", "how", "hello"};
//        String[] exercise17Resolve = new String[exercise17.length];
//        int index = 0;
//        for (int i = exercise17.length-1 ; i >= 0; i--) {
//            exercise17Resolve[index] = exercise17[i];
//            if (i == 0) {
//                exercise17Resolve[index] = exercise17[i]+"?";
//            }
//            index++;
//        }
//        System.out.println(Arrays.toString(exercise17Resolve));
//
//
//        //Exercise 18
//        /*
//        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".
//
//        Tip:
//        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
//        - create variable to store result. double result = 0;
//        - convert string to array.
//        - then loop.
//        - convert each string to decimal and add to current result
//    */
//        System.out.println("");
//        System.out.println("Exercise 18: ");
//        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
//        String[] resolveExercise18 = input.split(",");
//        double result = 0;
//
//        for (String s : resolveExercise18) {
//            result += Double.parseDouble(s);
//        }
//
//        System.out.println(result);


        /*
        ------------------------------------------------------
            CONDITIONALS EXERCISES
        ------------------------------------------------------
        */
//
//        // Exercise 1
//        // create a string variable
//        // create a second string variable which has the same value as the first
//        // create an `if` statement which compares the two variables and prints to the console if they are equal
//        System.out.println("");
//        System.out.println("CONDITIONALS EXERCISES");
//        System.out.println("Exercise 1:");
//        String name1 = "Joaquin";
//        String name2 = "Joaquin";
//        if (name1 == name2) {
//            System.out.println("The names are equals");
//        }else System.out.println("Are not equals");
//
//        //Exercise 2
//        // create an string variable using the `new` keyword
//        // create a second string variable which has the same value as the first, again using the `new` keyword
//        // create an `if` statement which compares the two variables and prints to the console if they are equal
//        System.out.println("");
//        System.out.println("Exercise 2:");
//        String nombre1 = new String("Joaquin");
//        String nombre2 = new String("Joaquin");
//        if (nombre1.equals(name2)) {
//            System.out.println("The names are equals");
//        }else System.out.println("Are not equals");
//
//        //Exercise 3 and 4:
//        // create two `int` variables. Assign them values
//        // create an `if` statement which compares whether one value is greater than the other
//        // print something to the console if the condition is met
//        // create an `else` statement which prints to the console if the above condition is NOT met
//        System.out.println("");
//        System.out.println("Exercise 3/4:");
//        int value1 = 333;
//        int value2 = 25;
//        int value3 = 50;
//        if (value1 > value2 || value1 < value3) {
//            System.out.println("Value 1 is greather than Value 2 but less than Value 3");
//        } else System.out.println("ggwp");
//
//        //Exercise 7
//        // create a String variable and assign it a value
//        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
//        // print something to the console if the condition is met
//        // Can you think of a way to make this check case insensitive? *** podemos pasar el string directamente a mayusculas o minusculas y luego chequear el char
////        System.out.println("");
////        System.out.println("Exercise 7:");
////        String myName = "Joaquin";
////        char myChar = 'j';
////        if (myName.toLowerCase().charAt(0) == myChar) {
////            System.out.println("Equal chart");
////        } else System.out.println("Not equal");
//
//
//        // Exercise 8
//        // In this final example, let's go one more step further and introduce a for loop to our previous answer.
//        // The idea is to use a for loop to check if the provided character is present at any point within our word.
//
//        // create a String variable and assign it a value
//        // create a `for` loop which wraps around your answer from Question 7
//        // modify your `if` statement to check the character at each index
//        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
//        // print something to the console if the condition is met
//        System.out.println("");
//        System.out.println("Exercise 8:");
//        String myName = "Ana";
//        char myChar = 'a';
//        int count = 0;
//
//        for (int i = 0; i < myName.length(); i++) {
//            char check = myName.toLowerCase().charAt(i);
//            if (myChar == check) {
//                count ++;
//                System.out.println("La letra: " + "'" + check + "'" + " esta en la palabra " + myName);
//            }
//
//        }
//
//        System.out.println("La letra se repitio una cantidad de " + count + " veces.");
//


        /*
        -------------------------------------------------
         ARRAYS CONDITIONALS METHODS
        -------------------------------------------------
         */

        System.out.println("Arrays Conditionals Methods Exercises:");
        System.out.println("");
        System.out.println("Exercise 2");
        /*
        Given the following String input
        String input = "   amig os cod e  "
        Write a program that transforms input into: Amigoscode
        */
        String brand = "   amig os cod e  ";
        String brandFixed = brand.replace(" ", "");
        System.out.println(brandFixed.toUpperCase().charAt(0) + brandFixed.substring(1, brandFixed.length()));

    }

}

