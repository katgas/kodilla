package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    public String share() {
        return "Hello there! I'm using Snapchat.";
    }
}
