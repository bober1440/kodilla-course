package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task createTask(String taskType) {
        return switch (taskType) {
            case SHOPPING -> new ShoppingTask("Grocery Shopping", "Milk", 2.0);
            case PAINTING -> new PaintingTask("Room Painting", "Blue", "Living Room");
            case DRIVING -> new DrivingTask("Morning Drive", "Work", "Car");
            default -> null;
        };
    }
}