package com.kodilla.stream.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@org.junit.jupiter.api.Nested
@DisplayName("Main Test")
public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5};

        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 3.0;

        //Then
        assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Nested
    @DisplayName("Additional Tests")
    class AdditionalTests {
        @Test
        void testGetMax() {
            //Given
            int[] numbers = {1, 2, 3, 4, 5};

            //When
            double result = ArrayOperations.getMax(numbers);
            double expectedResult = 5.0;

            //Then
            assertEquals(expectedResult, result);

        }

        @Test
        void testGetMin() {
            //Given
            int[] numbers = {1, 2, 3, 4, 5};

            //When
            double result = ArrayOperations.getMin(numbers);
            double expectedResult = 1.0;

            //Then
            assertEquals(expectedResult, result);
        }
    }
}

