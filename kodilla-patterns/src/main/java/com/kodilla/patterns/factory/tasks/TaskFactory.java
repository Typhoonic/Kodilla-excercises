package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(final String whatTask){

        switch (whatTask){
            case SHOPPING:
                return new ShoppingTask("shopping task...", "sugar", 3.50);
            case PAINTING:
                return new PaintingTask("painting task...", "red", "wall");
            case DRIVING:
                return new DrivingTask("driving task...", "Cracow", "car");
            default:
                return null;
        }

    }

}
