package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //given
        User josh = new Millenials("Josh Clark");
        User isabella = new YGeneration("Isabella Brown");
        User jessica = new ZGeneration("Jessica Pie");

        //when
        String joshPost = josh.sharePost();
        System.out.println("Josh added new post: " + joshPost);
        String isabellaPost = isabella.sharePost();
        System.out.println("Isabella added new post: " + isabellaPost);
        String jessicaPost = jessica.sharePost();
        System.out.println("Jessica added new post: " + jessicaPost);

        //then
        Assert.assertEquals("Hello there! I'm using Facebook.", joshPost);
        Assert.assertEquals("Hello there! I'm using Twitter.", isabellaPost);
        Assert.assertEquals("Hello there! I'm using Snapchat.", jessicaPost);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //given
        User jessica = new ZGeneration("Jessica Pie");

        //when
        String jessicaPost = jessica.sharePost();
        System.out.println("\nJessica added new post: " + jessicaPost);
        jessica.setIndividualStatus(new TwitterPublisher());
        jessicaPost = jessica.sharePost();
        System.out.println("Jessica added another new post: " + jessicaPost);

        //then
        Assert.assertEquals("Hello there! I'm using Twitter.", jessicaPost);
    }
}
