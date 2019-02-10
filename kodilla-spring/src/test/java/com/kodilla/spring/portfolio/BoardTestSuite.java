package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTask("Complete one chapter from the book");
        inProgressList.addTask("Learn Spring Framework");
        doneList.addTask("Pass the statistics exam");

        //when
        String toDo = toDoList.getTask(0);
        String inProgress = inProgressList.getTask(0);
        String done = doneList.getTask(0);

        //then
        Assert.assertEquals("Complete one chapter from the book", toDo);
        Assert.assertEquals("Learn Spring Framework", inProgress);
        Assert.assertEquals("Pass the statistics exam", done);
    }
}
