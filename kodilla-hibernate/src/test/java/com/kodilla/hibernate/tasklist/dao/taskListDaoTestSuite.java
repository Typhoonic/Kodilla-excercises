package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class taskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "Description for example";
    private static final String LISTNAME = "List for tests";

    @Test
    void testTaskListDaoSaveWithTasks(){

        //Given
        Task task = new Task("Test: Hibernate Learning", 14);
        Task task2 = new Task("Test: Write some entities", 3);

        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);

        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);

        TaskList taskList = new TaskList(LISTNAME, "ToDoTasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        assertNotEquals(0, id);
        //CleanUp
        taskListDao.deleteById(id);
    }

    @Test
    void testFindByListName(){

        //Given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        taskListDao.save(taskList);
        List<TaskList> tasks = taskListDao.findByListName(taskList.getListName());
        //When && Then
        assertEquals(1,tasks.size());
        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);

    }

}
