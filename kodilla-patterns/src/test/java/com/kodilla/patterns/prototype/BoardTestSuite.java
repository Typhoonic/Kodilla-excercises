package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testToString(){

        //Given
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("Task to do number" + n)));

        TasksList listInProgress = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number : " + n)));

        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Tasks number: " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        Board clonedBoard = null;

        try{
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");

        }catch(CloneNotSupportedException e){
            e.getStackTrace();
        }

        Board deepClonedBoard = null;

        try{
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        }catch(CloneNotSupportedException e){
            e.getStackTrace();
        }

        //When
        board.getLists().remove(listToDo);
        //Then

        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);

        assertEquals(2,board.getLists().size());
        assertEquals(2,clonedBoard.getLists().size());
        assertEquals(3, deepClonedBoard.getLists().size());
    }

}
