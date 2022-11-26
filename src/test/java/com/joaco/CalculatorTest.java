package com.joaco;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("canAddNumbers")  //Cambia el nombre al test
    void canTwoAddNumbers() {
        Calculator underTest = new Calculator();
        int n1 = 10;
        int n2 = 20;
        int result = underTest.add(n1, n2);
        assertEquals(30, result);
    }

    @Test
    void canHandleWhenInputInZero() {
        Calculator underTest = new Calculator();
        var result = underTest.add(0);
        assertEquals(0, result);
    }

    @Test
    void canAddNumbersFromAGivenArray() {
        Calculator underTest = new Calculator();
        var numbers = new int[]{1, 5, 3};
        var result = underTest.add(numbers);
        assertEquals(9, result);
    }

}
