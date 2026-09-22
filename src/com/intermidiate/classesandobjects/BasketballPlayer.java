package com.intermidiate.classesandobjects;

import java.util.Random;

/**
 * Represents a basketball player with personal info and performance statistics.
 * Demonstrates field declarations, constructor initialization with the 'this' keyword,
 * and a method simulating a random outcome based on percentage probability.
 */
public class BasketballPlayer {

    // Player personal information fields
    String name;
    String nickname;
    int yearOfBirth;
    String team;

    // Player performance statistics fields
    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    /**
     * Constructs a new BasketballPlayer object with specified attributes.
     *
     * @param name                 The full name of the player
     * @param nickname             The player's nickname
     * @param yearOfBirth          The year the player was born
     * @param team                 The team the player plays for
     * @param freeThrowPercentage The player's free throw success percentage (0 - 100)
     * @param pointsPerGame        Average points scored per game
     * @param gamesPlayed          Total number of career games played
     */
    public BasketballPlayer(String name, String nickname, int yearOfBirth, String team,
            double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        // Assign constructor parameters to instance fields using 'this' keyword
        this.name = name;
        this.nickname = nickname;
        this.yearOfBirth = yearOfBirth;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * Simulates taking a free throw shot.
     * Uses a Random number generator to produce a double from 0.0 to 100.0
     * and compares it against the player's free throw percentage.
     */
    public void freeThrow() {
        Random randomNumberGenerator = new Random();
        // randomNumberGenerator.nextDouble() returns a value between 0.0 (inclusive) and 1.0 (exclusive).
        // Multiplying by 100 scales it to a 0.0 - 100.0 percentage range.
        if ((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage) {
            System.out.println(name + " missed the free throw.");
        } else {
            System.out.println(name + " made the free throw.");
        }
    }

}

