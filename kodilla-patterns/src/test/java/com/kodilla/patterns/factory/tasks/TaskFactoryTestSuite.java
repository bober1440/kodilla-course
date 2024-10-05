package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);

        // Then
        assertNotNull(shopping);
        assertEquals("Grocery Shopping", shopping.getTaskName());
        assertFalse(shopping.isTaskExecuted());

        shopping.executeTask();
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task painting = factory.createTask(TaskFactory.PAINTING);

        // Then
        assertNotNull(painting);
        assertEquals("Room Painting", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());

        painting.executeTask();
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task driving = factory.createTask(TaskFactory.DRIVING);

        // Then
        assertNotNull(driving);
        assertEquals("Morning Drive", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());

        driving.executeTask();
        assertTrue(driving.isTaskExecuted());
    }
}