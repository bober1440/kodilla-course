package com.kodilla.testing.shape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName ("TDD :ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests");
    }
    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing test " + testCounter);
    }
    @AfterEach
    public void afterEachTest() {
        System.out.println("Finished test " + testCounter);
    }
    @org.junit.jupiter.api.Nested
    @DisplayName("Adding/Removing figures")
    class AddingRemoveTesting {
        @Test
        void addFigureTest(){
            //Given
            Shape Square = new Square(4);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(Square);
            //Then
            assertEquals(1 , shapeCollector.shapes.size());
        }
        @Test
        void removeFigureTest(){
            //Given
            Shape Circle = new Circle(5);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(Circle);
            //When
            boolean result = shapeCollector.removeFigure(Circle);
            //Then
            assertTrue(result);
            assertEquals(0 , shapeCollector.shapes.size());
        }
    }

    @org.junit.jupiter.api.Nested
    @DisplayName("Getting/Showing figures")
    class GettingShowingTesting {
        @Test
        void getFigureTest(){
            //Given
            Shape Triangle = new Triangle(8,4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(Triangle);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(Triangle, retrievedShape);
        }
        @Test
        void showFiguresTest(){
            //Given
            Shape Triangle = new Triangle(8,4);
            Shape Square = new Square(5);
            Shape Circle = new Circle(5);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(Triangle);
            shapeCollector.addFigure(Square);
            shapeCollector.addFigure(Circle);
            //When
            String result = shapeCollector.showFigures();
            //Then
            assertEquals("Triangle, Square, Circle", result);
        }
    }
}
