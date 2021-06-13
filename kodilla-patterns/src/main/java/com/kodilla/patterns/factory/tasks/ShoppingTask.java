package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "I executed task: " + taskName + " I bought " + whatToBuy + " With price: " + quantity + "pln.";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isExecuted)
            return true;
        else
            return false;
    }
}
