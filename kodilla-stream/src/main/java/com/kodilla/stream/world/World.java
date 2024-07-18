package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(final Continent continent) {
        continentList.add(continent);
    }

    public BigDecimal getPopulationOfWholeWorld(){
        return continentList.stream()
                .flatMap(p -> p.getCountriesInContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
