package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private TaskFactory taskFactory = new TaskFactory();

    @Test
    void testShoppingTaskFactory(){

        //Given
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("shopping task...", shoppingTask.getTaskName());
        assertFalse(shoppingTask.isTaskExecuted());
        System.out.println(shoppingTask.executeTask());
        assertTrue(shoppingTask.isTaskExecuted());

    }

    @Test
    void testPaintingTaskFactory(){

        //Given
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("painting task...", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
        System.out.println(paintingTask.executeTask());
        assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    void DrivingTaskFactory(){

        //Given
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("driving task...", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
        System.out.println(drivingTask.executeTask());
        assertTrue(drivingTask.isTaskExecuted());

    }

}
