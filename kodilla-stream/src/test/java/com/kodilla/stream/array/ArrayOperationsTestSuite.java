package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
        int [] numbers = {3,5,77,8,2,45,22,13,7,98,5,77,8,13,46,9,71,23,54,6};
        //when
        double avg = getAverage(numbers);
        System.out.println("The average is: "+ avg);
        //then
        Assert.assertEquals(29.6, avg, 0.01);
        Assert.assertEquals(20, numbers.length);
    }
}
