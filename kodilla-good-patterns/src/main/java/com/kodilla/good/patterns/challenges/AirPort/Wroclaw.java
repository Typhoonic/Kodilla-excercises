package com.kodilla.good.patterns.challenges.AirPort;

import java.util.ArrayList;
import java.util.List;

public class Wloclaw implements Cities{

    private String name = "Wloclaw";

    @Override
    public List<String> makeFlightScheduleFrom() {
        List<String> flightSchedule = new ArrayList<>();
        flightSchedule.add("Wloclaw -> Cracow");
        flightSchedule.add("Wloclaw -> Gdansk");

        return flightSchedule;

    }

    @Override
    public String toString() {
        return name;
    }
}
