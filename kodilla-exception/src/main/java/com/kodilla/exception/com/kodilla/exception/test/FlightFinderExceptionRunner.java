package com.kodilla.exception.com.kodilla.exception.test;

public class FlightFinderExceptionRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            System.out.println(flightFinder.findFlight(new Flight("Oslo", "Krakow")));
            System.out.println(flightFinder.findFlight(new Flight("New York", "Katowice")));
            System.out.println(flightFinder.findFlight(new Flight("Oslo", "Wroclaw")));

            //this one won't be taken into consideration..
            System.out.println(flightFinder.findFlight(new Flight("Rome", "Krakow")));

        } catch(RouteNotFoundException e) {

            System.out.println("Airport not found. Please try again. \n" + e);

        } finally {

            System.out.println("Thank you for using our Airlines.");
        }
    }
}
