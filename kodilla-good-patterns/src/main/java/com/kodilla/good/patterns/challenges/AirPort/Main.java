package com.kodilla.good.patterns.challenges.AirPort;

public class Main {

    public static void main(String[] args) {

        WroclawSchedule wroclaw = new WroclawSchedule();
        CracowSchedule cracow = new CracowSchedule();

        FlightScheduleProcessor flightScheduleProcessor = new FlightScheduleProcessor(new Flight());
        flightScheduleProcessor.searchFlightFrom(wroclaw.getClass().getName());
        flightScheduleProcessor.searchFlightTo(wroclaw.getClass().getName());
        flightScheduleProcessor.searchFlightFrom(cracow.getClass().getName());
        flightScheduleProcessor.searchFlightTo(cracow.getClass().getName());
        flightScheduleProcessor.searchFlightThrough(wroclaw.getClass().getName());
        flightScheduleProcessor.searchFlightThrough(cracow.getClass().getName());

    }

}
