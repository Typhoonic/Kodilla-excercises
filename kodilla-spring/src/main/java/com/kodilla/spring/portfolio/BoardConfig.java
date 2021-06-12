package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {

    private List<String> toDo;
    private List<String> inProgress;
    private List<String> done;

    @Autowired
    TaskList taskListToDo;

    @Autowired
    TaskList taskListInProgress;

    @Autowired
    TaskList taskListDone;

    @Bean
    @Scope("prototype")
    public TaskList getTaskList(){
        return new TaskList();
    }

    @Bean
    public Board board(){
        return new Board(taskListToDo,taskListInProgress,taskListDone);
    }


    public List<String> getToDo() {
        return toDo;
    }

    public List<String> getInProgress() {
        return inProgress;
    }

    public List<String> getDone() {
        return done;
    }
}
