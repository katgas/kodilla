package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OverallForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test number " + testCounter);
    }
    @After
    public void afterEveryTest() {
        System.out.println("Test number " + testCounter + " completed.");
    }

    @Test
    public void testWhenPostsCountEqualsZero() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(800);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(0, overall.getNumberOfPosts());
        Assert.assertTrue(overall.getNumberOfComments() == 800);
        Assert.assertEquals(0, overall.getAverageNumberOfCommentsPerPost(), 0);
        Assert.assertTrue(overall.getAverageNumberOfCommentsPerUser() < 1);
    }
    @Test
    public void testWhenPostsCountEquals1000() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(1000, overall.getNumberOfPosts());
        Assert.assertTrue(overall.getAverageNumberOfPostPerUser() == 100);
    }
    @Test
    public void testWhenCommentsCountEqualsZero() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(50);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i<20; i++) {
            usersNames.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(0, overall.getNumberOfComments());
        Assert.assertEquals(50, overall.getNumberOfPosts());
        Assert.assertEquals(20, overall.getNumberOfUsers());
        Assert.assertTrue(overall.getAverageNumberOfPostPerUser() < overall.getNumberOfUsers());
    }
    @Test
    public void testWhenCommentsCountIsLowerThanPostsCount() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(80);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(500, overall.getNumberOfPosts());
        Assert.assertEquals(80, overall.getNumberOfComments());
        Assert.assertTrue(overall.getNumberOfComments() < overall.getNumberOfPosts());
    }
    @Test
    public void testWhenCommentsCountIsGreaterThanPostsCount() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(150);
        when(statisticsMock.commentsCount()).thenReturn(800);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(150, overall.getNumberOfPosts());
        Assert.assertEquals(800, overall.getNumberOfComments());
        Assert.assertTrue(overall.getNumberOfComments() > overall.getNumberOfPosts());
    }
    @Test
    public void testWhenUsersCountEqualsZero() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(16);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(0, overall.getNumberOfUsers());
        Assert.assertTrue(overall.getAverageNumberOfCommentsPerPost() < 0.1);
    }
    @Test
    public void testWhenUsersCountEquals100() {
        Statistics statisticsMock = mock(Statistics.class);
        OverallForumStatistics overall = new OverallForumStatistics();
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i<100; i++) {
            usersList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //when
        overall.calculateAdvStatistics(statisticsMock);
        overall.showStatistics();
        //then
        Assert.assertEquals(100, overall.getNumberOfUsers());
        Assert.assertTrue(overall.getNumberOfUsers() == 100);
        Assert.assertTrue(overall.getNumberOfComments() == 100);
        Assert.assertTrue(overall.getAverageNumberOfCommentsPerUser() == 1);
    }
}
