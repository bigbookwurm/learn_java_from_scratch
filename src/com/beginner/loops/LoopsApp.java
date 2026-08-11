package com.beginner.loops;

/**
 * Demonstrates various types of loops and control flow structures in Java, including:
 * - while loop
 * - do-while loop
 * - standard for loop
 * - break statement for early termination
 * - nested loops
 */
public class LoopsApp {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // 1. WHILE LOOP
        // -------------------------------------------------------------
        // Evaluates condition first; runs repeatedly as long as condition remains true
        int i = 1;
        while (i <= 5) {
            System.out.println(i + ". BEING RIGHT SUCKS.");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println("");

        // -------------------------------------------------------------
        // 2. DO-WHILE LOOP
        // -------------------------------------------------------------
        // Executes the block at least once before checking the condition at the end
        int j = 1;
        do {
            System.out.println(j + ". Being RIGHT SUCKS.");
            j++;
        } while (j <= 5);
        System.out.println("Value of j: " + j);
        System.out.println("");

        // -------------------------------------------------------------
        // 3. FOR LOOP
        // -------------------------------------------------------------
        // Compact loop syntax combining (initialization; condition; update)
        for (int k = 1; k <= 5; k++) {
            System.out.println(k + ". Being RIGHT SUCKS.");
        }
        System.out.println("");

        // -------------------------------------------------------------
        // 4. BREAK STATEMENT
        // -------------------------------------------------------------
        // Immediately exits the loop when a specified condition is met
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(k + ". Being RIGHT SUCKS.");
        }
        System.out.println("");

        // -------------------------------------------------------------
        // 5. NESTED FOR LOOPS
        // -------------------------------------------------------------
        // Inner loop runs to completion for each iteration of the outer loop
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 2; l++) {
                System.out.println("k=" + k + " l=" + l + " Being RIGHT SUCKS.");
            }
        }

    }

}

