package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    @Transactional
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("Test", "This is a test");
        taskListDao.save(taskList);

        //When
        List<TaskList> taskLists = taskListDao.findByListName("Test");

        //Then
        assertEquals(1, taskLists.size());
        assertEquals("Test", taskLists.get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);
    }

}
