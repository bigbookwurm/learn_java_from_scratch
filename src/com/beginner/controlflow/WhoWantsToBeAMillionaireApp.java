package com.beginner.controlflow;

/**
 * WhoWantsToBeAMillionaireApp simulates a simple multiple-choice trivia game.
 * Demonstrates the use of primitive char variables and basic if-else conditional logic
 * to evaluate user answers and print feedback.
 */
public class WhoWantsToBeAMillionaireApp {

    public static void main(String[] args) {

        // Store the selected answer choice ('A', 'B', 'C', or 'D')
        char correctAnswer = 'B';

        // Display the trivia question and candidate choices to the console
        System.out.println("Who is named as the inventor of the light bulb?");
        System.out.println("A. Nikola Tesla");
        System.out.println("B. Thomas Edison");
        System.out.println("C. Alexander Graham Bell");
        System.out.println("D. Albert Einstein");
        System.out.println("Your answer: " + correctAnswer);

        // Conditional check using if-else: verify if the selected answer matches the correct choice ('B')
        if (correctAnswer == 'B') {
            System.out.println("Congratulations, you are right!");
        } else {
            System.out.println("Sorry, you are wrong!");
        }

    }
}

