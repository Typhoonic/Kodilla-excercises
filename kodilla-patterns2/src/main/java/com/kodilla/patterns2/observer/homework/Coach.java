package com.kodilla.patterns2.observer.homework;

public class Coach implements Observerr{

    private final String name;
    private int count;

    public Coach(String name) {
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println(name + ": New task to check" + task.getName() + "\n" +
        "(total: " + task.getTasks().size() + " tasks) from: " + task.getName());
        count ++;

    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
