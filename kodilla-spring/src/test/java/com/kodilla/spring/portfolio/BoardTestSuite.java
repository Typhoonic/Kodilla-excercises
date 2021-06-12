package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testTaskAdd(){

        //Given
        board.getDoneList().getTasks().add("Task for Done List");
        board.getToDoList().getTasks().add("To Do List");
        board.getInProgressList().getTasks().add("Get in progress List");
        //When
        //Then
        System.out.println("Done task: " + board.getDoneList().getTasks());
        System.out.println("To Do task: " + board.getToDoList().getTasks());
        System.out.println("In Progress task: " + board.getInProgressList().getTasks());

        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getToDoList().getTasks().size());
        
    }

}
