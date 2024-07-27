package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightsFinderTestSuite {
    @Test
    public void testFindFlightsBothAvailableAirports() throws RouteNotFoundException {
        //Given
        FlightsFinder flightsFinder = new FlightsFinder();
        Flight availableBoth = new Flight("Cracow", "Tokyo");
        //When
        String result = flightsFinder.findFlights(availableBoth);
        //Then
        assertEquals("This flight is available", result);
    }

    @Test
    public void testFindFlightsBothSameAirports() throws RouteNotFoundException {
        //Given
        FlightsFinder flightsFinder = new FlightsFinder();
        Flight sameAirports = new Flight("Madrid", "Madrid");
        //When
        String result2 = flightsFinder.findFlights(sameAirports);
        //Then
        assertEquals("Wrong way ! You can't go to the same airport", result2);
    }

    @Test
    public void testWhenOnlyOneAirportIsAvailable() throws RouteNotFoundException {
        //Given
        FlightsFinder flightsFinder = new FlightsFinder();
        Flight oneAvailable  = new Flight("Cracow", "Barcelona");
        //When
        String result3 = flightsFinder.findFlights(oneAvailable);
        //Then
        assertEquals("This flight is not available", result3);
    }

    @Test
    public void testWhenAirportIsNotAvailable()  {
        //Given
        FlightsFinder flightsFinder = new FlightsFinder();
        Flight oneNotAvailable = new Flight("Buenos Aires", "Cracow");
        Flight bothNotAvailable = new Flight("Buenos Aires", "Paris");
        //When&Then
        assertThrows(RouteNotFoundException.class, () -> flightsFinder.findFlights(oneNotAvailable));
        assertThrows(RouteNotFoundException.class, () -> flightsFinder.findFlights(bothNotAvailable));
    }
}
