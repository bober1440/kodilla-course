package com.kodilla.good.patterns.flights;

import java.util.HashSet;

public class Possibilities {
    public HashSet<Flight> flightPossibilities(){
        HashSet<Flight> flights = new HashSet<>();
        flights.add(new Flight("Warsaw", "Cracow"));
        flights.add(new Flight("Berlin", "Cracow"));
        flights.add(new Flight("Moscow", "New York"));
        flights.add(new Flight("Lisbon", "New York"));
        flights.add(new Flight("New York", "Madrid"));
        flights.add(new Flight("Cracow", "Madrid"));
        flights.add(new Flight("Madrid", "Quito"));
        flights.add(new Flight("Warsaw", "Quito"));
        return flights;
    }
}
