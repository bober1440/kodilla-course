package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Country Country1 = new Country("Albania", new BigDecimal("1000"));
        Country Country2 = new Country("Belgium", new BigDecimal("2000"));
        Country Country3 = new Country("Canada", new BigDecimal("3000"));
        Country Country4 = new Country("Germany", new BigDecimal("4000"));
        Country Country5 = new Country("India", new BigDecimal("5000"));
        Country Country6 = new Country("United Kingdom", new BigDecimal("6000"));
        Country Country7 = new Country("Armenia", new BigDecimal("7000"));
        Country Country8 = new Country("Brazil", new BigDecimal("8000"));
        Country Country9 = new Country("Bulgaria", new BigDecimal("9000"));
        Country Country10 = new Country("Spain", new BigDecimal("10000"));

        Continent continent1 = new Continent("Asia");
        Continent continent2 = new Continent("Europe");
        Continent continent3 = new Continent("North America");
        Continent continent4 = new Continent("South America");
        Continent continent5 = new Continent("Europe");
        Continent continent6 = new Continent("Antarctica");

        //When
        continent1.addCountryToContinent(Country1);
        continent2.addCountryToContinent(Country2);
        continent3.addCountryToContinent(Country3);
        continent4.addCountryToContinent(Country4);
        continent5.addCountryToContinent(Country5);
        continent6.addCountryToContinent(Country6);
        continent1.addCountryToContinent(Country7);
        continent2.addCountryToContinent(Country8);
        continent3.addCountryToContinent(Country9);
        continent4.addCountryToContinent(Country10);

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);
        world.addContinent(continent6);

        BigDecimal expectedResult = new BigDecimal("55000");
        BigDecimal result = world.getPopulationOfWholeWorld();

        //Then
        assertEquals (expectedResult, result);
    }
}
