package com.kodilla.good.patterns.challenges.AirPort;

public class Gdańsk implements Cities{

    private String name = "Gdańsk";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
