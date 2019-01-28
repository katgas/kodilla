package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    public String getColor() {
        return color;
    }
    @Override
    public void executeTask() {
        System.out.println("Execution of the [" + getTaskName() + "] in progress.");
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(whatToPaint == "Bookshelf") {
            return true;
        } else {
            return false;
        }
    }
}
