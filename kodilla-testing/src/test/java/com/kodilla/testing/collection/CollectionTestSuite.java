package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Let's begin testing..");
    }
    @After
    public void after() {
        System.out.println("End of the test.");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is the beginning of all tests.");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("All tests are finished.");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("The list is empty.");
        //then
        Assert.assertEquals(exterminator.exterminate(list),list);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        System.out.println("The list contains both even and uneven numbers.");
        for(int i = 0; i < 20; i++) {
            list.add(i);
            if(i % 2 == 0) {
                evenList.add(i);
            }
        }
        //then
        Assert.assertEquals(exterminator.exterminate(list), evenList);
    }
}
