package com.kodilla.testing.forum.statistics;

public class OverallForumStatistics {
    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private double averageNumberOfPostPerUser = 0;
    private double averageNumberOfCommentsPerUser = 0;
    private double averageNumberOfCommentsPerPost = 0;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    public int getNumberOfComments() {
        return numberOfComments;
    }
    public double getAverageNumberOfPostPerUser() {
        return averageNumberOfPostPerUser;
    }
    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }
    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if(numberOfUsers > 0) {
            averageNumberOfCommentsPerUser = (double)numberOfComments/(double)numberOfUsers;
            averageNumberOfPostPerUser = (double)numberOfPosts/(double)numberOfUsers;
        }
        if(numberOfPosts > 0) {
            averageNumberOfCommentsPerPost = (double)numberOfComments/(double)numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: "+ numberOfUsers +
                "\nNumber of posts: " + numberOfPosts +
                "\nNumber of comments: " + numberOfComments +
                "\nAverage number of comments per post: " + averageNumberOfCommentsPerPost +
                "\nAverage number of comments per user: " + averageNumberOfCommentsPerUser +
                "\nAverage number of posts per user: " + averageNumberOfPostPerUser);
    }
}