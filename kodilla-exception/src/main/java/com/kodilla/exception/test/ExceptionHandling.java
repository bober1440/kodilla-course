package com.kodilla.exception.test;

import java.io.IOException;


public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String stringSecondChallenge = "";

        try {
            stringSecondChallenge = secondChallenge.probablyIWillThrowException(3.0, 3.0);
            System.out.println("Great! You avoided the exception!");

        } catch (Exception e) {
            System.out.println("You have to use arguments (2,1] for first and second different " +
                    "than 1.5 to avoid exception. Exception: " + e);

        } finally {
            System.out.println("Done!");

        }
    }
}
