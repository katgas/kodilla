package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double sum = calculator.add(1,2);
        double subtract = calculator.sub(15,10);
        double multiply = calculator.mul(2,3);
        double divide = calculator.div(10,2);
        //then
        Assert.assertEquals(3, sum, 0.0);
        Assert.assertEquals(5, subtract, 0.0);
        Assert.assertEquals(6, multiply, 0.0);
        Assert.assertEquals(5, divide, 0.0);
    }
}
