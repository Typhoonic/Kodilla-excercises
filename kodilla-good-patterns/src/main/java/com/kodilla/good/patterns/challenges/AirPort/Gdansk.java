package com.kodilla.good.patterns.challenges.AirPort;

import java.util.ArrayList;
import java.util.List;

public class Gdansk implements Cities{

    private String name = "Gdansk";

    @Override
    public List<String> makeFlightScheduleFrom() {
        List<String> flightSchedule = new ArrayList<>();
        flightSchedule.add("Gdansk -> Wroclaw");
        flightSchedule.add("Gdansk -> Cracow");

        return flightSchedule;

    }

    @Override
    public List<String> makeFlightScheduleTo() {

        List<String> flightScheduleTo = new ArrayList<>();
        flightScheduleTo.add("Wroclaw -> Gdansk");
        flightScheduleTo.add("Cracow -> Gdansk");
        return flightScheduleTo;

    }

    @Override
    public List<String> makeFlightScheduleThrough() {

        List<String> flightScheduleThrough = new ArrayList<>();
        flightScheduleThrough.add("Wroclaw -> Cracow -> Gdansk");
        flightScheduleThrough.add("Cracow -> Wroclaw -> Gdansk");
        return flightScheduleThrough;

    }

    @Override
    public String toString() {
        return name;
    }
}
