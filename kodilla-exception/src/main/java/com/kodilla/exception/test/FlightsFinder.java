package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsFinder {

    public String findFlights(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Cracow", true);
        airports.put("Warsaw", false);
        airports.put("Barcelona", false);
        airports.put("Madrid", true);
        airports.put("Oslo", false);
        airports.put("Osaka", false);
        airports.put("Tokyo", true);
        airports.put("Katowice", false);
        airports.put("New York", true);

        if (!airports.containsKey(flight.getArrivalAirport()) || !airports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Route not found");
        }else if(flight.getDepartureAirport().equals(flight.getArrivalAirport())) {
                return "Wrong way ! You can't go to the same airport";
        } else if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())) {
            return "This flight is available";
        } else{
            return "This flight is not available";
        }
    }
}
