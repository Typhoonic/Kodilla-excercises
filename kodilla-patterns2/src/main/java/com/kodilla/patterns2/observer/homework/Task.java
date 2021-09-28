package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Task implements Observablee{

    private final List<Observerr> observers;
    private final String name;
    private final Deque<String> tasks;


    public Task(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task){
        tasks.offer(task);
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    @Override
    public void registerObserver(Observerr observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observerr observer: observers)
            observer.update(this);
    }

    @Override
    public void removeObserver(Observerr observer) {
        observers.remove(observer);
    }
}
