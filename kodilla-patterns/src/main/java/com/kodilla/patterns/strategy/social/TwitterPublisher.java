package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    public String share() {
        return "Hello there! I'm using Twitter.";
    }
}
