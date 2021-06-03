package com.kodilla.good.patterns.challenges.AirPort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {

    private CracowSchedule cracow = new CracowSchedule();
    private GdanskSchedule gdansk = new GdanskSchedule();
    private WroclawSchedule wroclaw = new WroclawSchedule();

    public Map<Cities, List<String>> flightFrom(){

        Map<Cities, List<String>> flightFrom = new HashMap<>();
        flightFrom.put(cracow, cracow.makeFlightScheduleFrom());
        flightFrom.put(wroclaw, wroclaw.makeFlightScheduleFrom());
        flightFrom.put(gdansk, gdansk.makeFlightScheduleFrom());
        return flightFrom;
    }

    public Map<Cities, List<String>> flightTo(){

        Map<Cities, List<String>> flightTo = new HashMap<>();
        flightTo.put(cracow, cracow.makeFlightScheduleTo());
        flightTo.put(wroclaw, wroclaw.makeFlightScheduleTo());
        flightTo.put(gdansk, gdansk.makeFlightScheduleTo());
        return flightTo;
    }

    public Map<Cities, List<String>> flightThrough(){

        Map<Cities, List<String>> flightThrough = new HashMap<>();
        flightThrough.put(cracow, cracow.makeFlightScheduleThrough());
        flightThrough.put(wroclaw, wroclaw.makeFlightScheduleThrough());
        flightThrough.put(gdansk, gdansk.makeFlightScheduleThrough());
        return flightThrough;
    }

}
