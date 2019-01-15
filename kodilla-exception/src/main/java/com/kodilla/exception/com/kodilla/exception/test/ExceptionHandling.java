package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String [] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(3, 0.5);
            System.out.println("No Exception has been found. " + result);

        } catch (Exception e) {
            System.out.println("The condition with new Exception has been met: " + e);

        } finally {
            System.out.println("THE END");

        }
    }
}
