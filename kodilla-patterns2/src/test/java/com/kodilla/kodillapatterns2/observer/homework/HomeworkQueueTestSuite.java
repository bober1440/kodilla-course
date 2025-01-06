package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeworkQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        HomeworkQueue student1Queue = new HomeworkQueue("John Doe");
        HomeworkQueue student2Queue = new HomeworkQueue("Jane Smith");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        student1Queue.registerObserver(mentor1);
        student2Queue.registerObserver(mentor2);
        student1Queue.registerObserver(mentor2);

        // When
        student1Queue.addTask("Task 1 for John");
        student1Queue.addTask("Task 2 for John");
        student2Queue.addTask("Task 1 for Jane");
        student1Queue.addTask("Task 3 for John");
        student2Queue.addTask("Task 2 for Jane");

        // Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(5, mentor2.getUpdateCount());
    }
}