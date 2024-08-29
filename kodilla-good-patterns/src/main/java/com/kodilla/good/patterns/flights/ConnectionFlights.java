package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectionFlights {

    public void searchByDeparture(String departureAirport) {
        Possibilities possibilities = new Possibilities();

        possibilities.flightPossibilities().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println(flight));
    }

    public void searchByArrival(String arrivalAirport) {
        Possibilities possibilities = new Possibilities();

        possibilities.flightPossibilities().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .forEach(flight -> System.out.println(flight));
    }

    public void searchConnectingFlights(String departureAirport, String arrivalAirport) {
        Possibilities possibilities = new Possibilities();

        List<Flight> departureList = possibilities.flightPossibilities().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        List<Flight> arrivalList = possibilities.flightPossibilities().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        int n = 1;
        for(Flight departureConnection : departureList) {
            for(Flight arrivalConnection : arrivalList) {
                if(departureConnection.getDepartureAirport().equals(departureAirport)) {
                    System.out.println("Connecting " + n);
                    System.out.println(departureConnection + "\n" + arrivalConnection);
                    n++;
                }
            }
        }
    }
}
