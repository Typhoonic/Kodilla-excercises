package com.kodilla.good.patterns.challenges.AirPort;

import java.util.ArrayList;
import java.util.List;

public class CracowSchedule implements Cities{

    private String name = "Cracow";

    @Override
    public List<String> makeFlightScheduleFrom() {

        List<String> flightScheduleFrom = new ArrayList<>();
        flightScheduleFrom.add("Cracow -> Wroclaw");
        flightScheduleFrom.add("Cracow -> Gdansk");

        return flightScheduleFrom;
    }

    @Override
    public List<String> makeFlightScheduleTo() {

        List<String> flightScheduleTo = new ArrayList<>();
        flightScheduleTo.add("Wroclaw -> Cracow");
        flightScheduleTo.add("Gdansk -> Cracow");
        return flightScheduleTo;

    }

    @Override
    public List<String> makeFlightScheduleThrough() {

        List<String> flightScheduleThrough = new ArrayList<>();
        flightScheduleThrough.add("Wroclaw -> Gdansk -> Cracow");
        flightScheduleThrough.add("Gdansk -> Wroclaw -> Cracow");
        return flightScheduleThrough;

    }

    @Override
    public String toString() {
        return name;
    }
}
