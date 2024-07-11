package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {



    @BeforeEach
    public void beforeEach() {

        System.out.println("Test Case : begin");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test Case : end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite : begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite : end");
    }

    @DisplayName("If the checking list is empty, the method should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");

        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("If the checking list contains odd and even numbers, " +
                    "the method should return only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> oddEvenNumbers = new ArrayList<>();
        oddEvenNumbers.add(1);
        oddEvenNumbers.add(2);
        oddEvenNumbers.add(3);
        oddEvenNumbers.add(4);
        oddEvenNumbers.add(5);
        oddEvenNumbers.add(6);
        oddEvenNumbers.add(7);
        oddEvenNumbers.add(8);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);

        //When
        List<Integer> resultOddEvenNumbers = oddNumbersExterminator.exterminate(oddEvenNumbers);
        System.out.println("Testing oddEvenNumbers");

        //Then
        Assertions.assertEquals(evenNumbers, resultOddEvenNumbers);
    }

    @DisplayName("If the checking list contains odd and even numbers, " +
            "the method should return only even numbers, but using Arrays.asList() method")
    @Test
    void testOddNumbersExterminatorNormalListUsingArraysAsListMethod(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        Integer [] oddEvenNumbersArray = new Integer[]{1,2,3,4,5,6,7,8,};
        Integer [] evenNumbersArray = new Integer[]{2,4,6,8,};

        //When
        List<Integer> expected = oddNumbersExterminator.exterminate(Arrays.asList(oddEvenNumbersArray));

        //Then
        Assertions.assertArrayEquals(expected.toArray(), evenNumbersArray);
    }
}
