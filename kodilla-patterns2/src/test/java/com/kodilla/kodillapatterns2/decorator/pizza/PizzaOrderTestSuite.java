package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseAndPepperoniGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(27.00), calculatedCost);
    }

    @Test
    public void testPizzaWithExtraCheeseAndPepperoniGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese + extra cheese + pepperoni", description);
    }

    @Test
    public void testPizzaWithOlivesAndExtraCheeseGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(23.50), calculatedCost);
    }

    @Test
    public void testPizzaWithOlivesAndExtraCheeseGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese + olives + extra cheese", description);
    }
}
