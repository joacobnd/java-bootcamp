package com.joaco.exercises.datastructures;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise1 {
    public static void main(String[] args) {
        String[] input = {"1", "1", "1", "1", "3", "4", "5", "6", "7", "7", "7", "8", "8"};
        int[] numbers = new int[input.length];
        Arrays.sort(numbers);
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        highOcurrences(numbers);


    }







    public static int mostFrequent(int[] ary) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int a : ary) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        int max = -1;
        int mostFrequent = -1;

        for (Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > max) {
                mostFrequent = e.getKey();
                max = e.getValue();
            }
        }

        return mostFrequent;
    }

    public static void highOcurrences(int[] array) {
        int max = 0;
        int numb = 0;
        int count[] = new int[array.length];
        for(int i = 0 ; i < array.length ; i++) {
            // i = 0
            int ch = array[i]; //1
            count[ch] +=1 ;
        }

        for(int i = 0 ; i <array.length ;i++)  {
            int ch = array[i];
            if(count[ch] > max) {
                max = count[ch];
                numb = ch;
            }
        }
        System.out.println("Number " + numb + " repeat " + max + " times");
    }


    public static void findOccurrences(int[] originalArray) {
        int count = 0;
        int aux = originalArray[0];

        for (int i = 0; i < originalArray.length; i++) {
            if (aux == originalArray[i]) {
                count++;
            } else {
                System.out.println(aux + ": " + count);
                count = 1;
                aux = originalArray[i];
            }
        }
    }
}
