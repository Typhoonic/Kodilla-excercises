package com.kodilla.patterns.builder.checkers;

public class Figure {

    public static final String WHITE = "WHITE";
    public static final String BLACK = "BLACK";
    private final String color;

    public Figure(String color) {

        if(color.equals(WHITE) || color.equals(BLACK)){
            this.color = color;
        }else{
            throw new IllegalStateException("Figures of checker should be White or Black!");
        }
    }

    public String getColor() {
        return color;
    }
}
