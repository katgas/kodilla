package com.kodilla.exception.com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Krakow", true);
        flightMap.put("Katowice", false);

        if(flightMap.containsKey(flight.getArrivalAirport())) {
            return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Sorry, the airport you are looking for does not exist.");
        }

    }
}
