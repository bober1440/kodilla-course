package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BigMacTestSuite {

    @Test
    void testBigMacBuilder(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Normal")
                .burgers(5)
                .sauce("Chilli")
                .ingredient("Onion")
                .ingredient("Tomato")
                .ingredient("Cheese")
                .build();

        System.out.println(bigMac);

        //When
        int numberOfIngredients = bigMac.getIngredients().size();

        //Then
        assertEquals("Normal", bigMac.getBun());
        assertEquals(3, numberOfIngredients);
        assertEquals("Chilli", bigMac.getSauce());
        assertFalse(bigMac.getIngredients().isEmpty());
        assertEquals("Onion", bigMac.getIngredients().get(0));
        assertEquals("Tomato", bigMac.getIngredients().get(1));
        assertEquals(5, bigMac.getBurgers());

    }
}
