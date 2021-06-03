package com.kodilla.good.patterns.challenges.AirPort;

import java.util.List;
import java.util.Map;

public class FlightScheduleProcessor {

    private Flight flight;

    public FlightScheduleProcessor(Flight flight){

        this.flight = flight;

    }

    public void searchFlightFrom(String name){

        Map<Cities, List<String>> flightScheduleFrom = flight.flightFrom();

        System.out.println("Departures: ");

        flightScheduleFrom.entrySet().stream()
                .filter(f -> name.equals(f.getKey().getClass().getName()))
                .flatMap(entry -> entry.getValue().stream())
                .forEach(System.out::println);

        System.out.println();
    }

    public void searchFlightTo(String name){

        Map<Cities, List<String>> flightScheduleTo = flight.flightTo();

        System.out.println("Arrivals: ");

        flightScheduleTo.entrySet().stream()
                .filter(f -> name.equals(f.getKey().getClass().getName()))
                .flatMap(entry -> entry.getValue().stream())
                .forEach(System.out::println);

        System.out.println();

    }

    public void searchFlightThrough(String name){

        Map<Cities, List<String>> flightScheduleTo = flight.flightThrough();

        System.out.println("Arrivals with connection: ");

        flightScheduleTo.entrySet().stream()
                .filter(f -> name.equals(f.getKey().getClass().getName()))
                .flatMap(entry -> entry.getValue().stream())
                .forEach(System.out::println);

        System.out.println();

    }


}
