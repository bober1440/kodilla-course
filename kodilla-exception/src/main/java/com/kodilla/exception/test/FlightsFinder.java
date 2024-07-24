package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsFinder {

    public void findFlights(Flight flight) throws  RouteNotFoundException{
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Cracow", false);
        flights.put("Katowice", false);
        flights.put("Lima", true);
        flights.put("Barcelona", true);
        flights.put("Malta", true);
        flights.put("Madrid", true);
        flights.put("Berlin", false);

        for(Map.Entry<String, Boolean> entry : flights.entrySet()){
            if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue()){
                System.out.println("You can flight there");
                return;
            }

            if (entry.getKey().equals(flight.getArrivalAirport()) && !entry.getValue()){
                System.out.println("You can't flight there");
                return;
            }

        }
        throw new RouteNotFoundException("The airport was not found. Check your flights");
    }
}
