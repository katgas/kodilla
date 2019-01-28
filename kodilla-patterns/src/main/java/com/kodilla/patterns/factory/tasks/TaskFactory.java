package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";

    public final Task generateTask(final String taskGenerator) {
        switch(taskGenerator) {
            case DRIVING_TASK:
                return new DrivingTask("Drive to the lecture", "University", "Bicycle");
            case PAINTING_TASK:
                return new PaintingTask("Renovate the kitchen", "Yellow", "Walls");
            case SHOPPING_TASK:
                return new ShoppingTask("Buy something to eat", "Pizza", 3);
            default:
                return null;
        }
    }
}
