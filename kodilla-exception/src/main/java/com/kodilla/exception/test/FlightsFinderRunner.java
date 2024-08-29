package com.kodilla.exception.test;

public class FlightsFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Lima");
        FlightsFinder flightsFinder = new FlightsFinder();
        try {
            System.out.println(flightsFinder.findFlights(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println( e.getMessage());
        } finally {
            System.out.println("Searching finished");
        }

        Flight flight2 = new Flight("Cracow", "Cracow");
        FlightsFinder flightsFinder2 = new FlightsFinder();
        try{
            System.out.println(flightsFinder.findFlights(flight2));
        }catch (RouteNotFoundException e){
            System.out.println( e.getMessage());
        } finally {
            System.out.println("Searching finished");
        }

        Flight flight3 = new Flight("Cracow", "Tokyo");
        FlightsFinder flightsFinder3 = new FlightsFinder();
        try{
            System.out.println(flightsFinder.findFlights(flight3));
        }catch (RouteNotFoundException e){
            System.out.println( e.getMessage());
        } finally{
            System.out.println("Searching finished");
        }

    }
}
