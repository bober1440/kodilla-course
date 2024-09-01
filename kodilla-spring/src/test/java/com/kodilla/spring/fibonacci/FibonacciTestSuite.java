package com.kodilla.spring.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTestSuite {

    @Test
    public void fibonacciTest() {
        //Given
        Fibonacci fibonacci = new Fibonacci();
        int n=10;
        //When
        int result = fibonacci.Fibonacci(10);
        //Then
        assertEquals(55,result);
    }
}
