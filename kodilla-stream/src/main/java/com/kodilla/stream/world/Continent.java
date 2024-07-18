package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private final String nameOfContinent;
    private final List<Country> countriesInContinent = new ArrayList<>();
    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }
    public String getNameOfContinent() {
        return nameOfContinent;
    }
    public List<Country> getCountriesInContinent() {
        return countriesInContinent;
    }

    public void addCountryToContinent(final Country country) {
        countriesInContinent.add(country);
    }

    public Set<BigDecimal> getPopulationFromCountires(){
        return countriesInContinent.stream()
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toSet());
    }
}
