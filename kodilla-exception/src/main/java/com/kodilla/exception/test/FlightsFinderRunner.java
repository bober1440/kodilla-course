package com.kodilla.exception.test;

public class FlightsFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw","Lima");
        FlightsFinder flightsFinder = new FlightsFinder();

        try{
            flightsFinder.findFlights(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found" + e.getMessage());
        } finally {
            System.out.println("Searching finished");
        }

        Flight flight2 = new Flight("Warsaw","Paris");
        FlightsFinder flightsFinder2 = new FlightsFinder();

        try{
            flightsFinder.findFlights(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found  " + e.getMessage());
        } finally {
            System.out.println("Searching finished");
        }


    }
}
