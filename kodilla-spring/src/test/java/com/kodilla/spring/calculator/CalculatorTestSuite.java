package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    double a = 10;
    double b = 5;

    @Autowired
    Calculator calculator;

    @Test
    void testAddToB(){
        //Given
        //When
        double result = calculator.add(a, b);
        //Then
        assertEquals(15.0, result);
    }

    @Test
    void testSubtractFromA(){
        //Given
        //When
        double result = calculator.subtract(a, b);
        //Then
        assertEquals(5.0, result);
    }

    @Test
    void testMultiplyByA(){
        //Given
        //When
        double result = calculator.multiply(a, b);
        //Then
        assertEquals(50.0, result);
    }

    @Test
    void testDivideByB(){
        //Given
        //When
        double result = calculator.divide(a, b);
        //Then
        assertEquals(2.0, result);
    }

}
