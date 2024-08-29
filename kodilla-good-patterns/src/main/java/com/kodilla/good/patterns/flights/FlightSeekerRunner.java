package com.kodilla.good.patterns.flights;

public class FlightSeekerRunner {
    public static void main(String[] args) {
        ConnectionFlights connectionFlights = new ConnectionFlights();
        String departure = "Warsaw";
        String arrival = "Cracow";

        System.out.println("Possible connection from: " + departure);
        connectionFlights.searchByDeparture(departure);

        System.out.println("Possible connection to: " + arrival);
        connectionFlights.searchByArrival(arrival);

        System.out.println("Connecting flight from: " + departure + " to " + arrival + ":");
        connectionFlights.searchConnectingFlights(departure, arrival);
    }
}
