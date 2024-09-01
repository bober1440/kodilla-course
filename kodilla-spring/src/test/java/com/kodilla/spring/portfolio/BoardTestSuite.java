package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testTaskAdd(){
        //Given
        String toDoTask = "Task 1";
        String toDoTask2 = "Task 2";
        String toDoTask3 = "Task 3";
        String inProgressTask = "Task 1";
        String inProgressTask2 = "Task 2";
        String doneTask = "Task 3";

        //When
        board.getToDoList().getTasks().add(toDoTask);
        board.getToDoList().getTasks().add(toDoTask2);
        board.getToDoList().getTasks().add(toDoTask3);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getInProgressList().getTasks().add(inProgressTask2);
        board.getDoneList().getTasks().add(doneTask);
        int toDoListSize = board.getToDoList().getTasks().size();
        int inProgressListSize = board.getInProgressList().getTasks().size();
        int doneListSize = board.getDoneList().getTasks().size();

        //Then
        assertEquals(toDoTask, board.getToDoList().getTasks().get(0));
        assertEquals(toDoTask2, board.getToDoList().getTasks().get(1));
        assertEquals(toDoTask3, board.getToDoList().getTasks().get(2));
        assertEquals(inProgressTask, board.getInProgressList().getTasks().get(0));
        assertEquals(inProgressTask2, board.getInProgressList().getTasks().get(1));
        assertEquals(doneTask, board.getDoneList().getTasks().get(0));
        assertEquals(3, toDoListSize);
        assertEquals(2, inProgressListSize);
        assertEquals(1, doneListSize);
    }

}
