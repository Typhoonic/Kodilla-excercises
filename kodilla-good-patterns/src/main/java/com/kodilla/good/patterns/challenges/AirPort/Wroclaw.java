package com.kodilla.good.patterns.challenges.AirPort;

import java.util.ArrayList;
import java.util.List;

public class Wroclaw implements Cities{

    private String name = "Wloclaw";

    @Override
    public List<String> makeFlightScheduleFrom() {
        List<String> flightSchedule = new ArrayList<>();
        flightSchedule.add("Wroclaw -> Cracow");
        flightSchedule.add("Wroclaw -> Gdansk");

        return flightSchedule;

    }

    @Override
    public List<String> makeFlightScheduleTo() {

        List<String> flightScheduleTo = new ArrayList<>();
        flightScheduleTo.add("Cracow -> Wroclaw");
        flightScheduleTo.add("Gdansk -> Wroclaw");
        return flightScheduleTo;

    }

    @Override
    public List<String> makeFlightScheduleThrough() {

        List<String> flightScheduleThrough = new ArrayList<>();
        flightScheduleThrough.add("Gdansk -> Cracow -> Wroclaw");
        flightScheduleThrough.add("Cracow -> Gdansk -> Wroclaw");
        return flightScheduleThrough;

    }

    @Override
    public String toString() {
        return name;
    }
}
