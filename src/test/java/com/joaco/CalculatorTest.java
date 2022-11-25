package com.joaco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canTwoAddNumbers() {
        Calculator underTest = new Calculator();
        int n1 = 10;
        int n2 = 20;
        int result = underTest.add(n1, n2);
        assertEquals(30, result);
    }
}
