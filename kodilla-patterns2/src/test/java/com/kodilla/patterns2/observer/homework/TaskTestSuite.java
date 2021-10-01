package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTestSuite {

    @Test
    void shouldReturnSizeOfTasks() {
        //Given
        Task kamilTasks = new Task("Kamil");
        Task lukaszTasks = new Task("Lukasz");
        Task basiaTasks = new Task("Basia");
        Coach mateusz = new Coach("Mateusz");
        Coach andrzej = new Coach("Andrzej");
        //When
        kamilTasks.registerObserver(mateusz);
        lukaszTasks.registerObserver(andrzej);
        basiaTasks.registerObserver(mateusz);
        kamilTasks.addTask("Task1");
        kamilTasks.addTask("Task2");
        lukaszTasks.addTask("Task3");
        basiaTasks.addTask("Task4");
        //Then
        assertEquals(3, mateusz.getCount());
        assertEquals(1, andrzej.getCount());
    }
}
