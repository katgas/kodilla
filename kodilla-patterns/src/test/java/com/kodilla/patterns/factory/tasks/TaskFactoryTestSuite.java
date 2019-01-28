package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task paintingTask = factory.generateTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //then
        Assert.assertEquals("Renovate the kitchen", paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }
    @Test
    public void testDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task drivingTask = factory.generateTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //then
        Assert.assertEquals("Drive to the lecture", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }
    @Test
    public void testShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shoppingTask = factory.generateTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //then
        Assert.assertEquals("Buy something to eat", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
