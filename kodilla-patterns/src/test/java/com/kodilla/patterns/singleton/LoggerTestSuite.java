package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void createNewLog() {
        logger.getInstance().log("28/01/2019 14:00 <Trying to solve Kodilla task>");
    }
    @Test
    public void testGetLastLog() {
        //given
        //when
        String lastLog = logger.getInstance().getLastLog();
        System.out.println("The last log was: " + lastLog);
        //then
        Assert.assertEquals("28/01/2019 14:00 <Trying to solve Kodilla task>", lastLog);
    }
}
