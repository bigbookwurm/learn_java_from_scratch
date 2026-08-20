package com.beginner.arrays;

/**
 * ArraysApp demonstrates basic concepts and usage of Arrays in Java:
 * - Declaring, instantiating, and populating 1D (single-dimensional) arrays
 * - Iterating 1D arrays using an Enhanced For-Loop (for-each loop)
 * - Declaring and initializing 2D (two-dimensional) arrays using array literals
 * - Traversing 2D arrays (matrices) using nested for-loops
 */
public class ArraysApp {

    public static void main(String[] args) {
        // ==========================================
        // 1. Single-Dimensional (1D) Array Example
        // ==========================================

        // Declare and instantiate an integer array of fixed size 5 (valid indices: 0 to 4)
        int[] lotteryNumbers = new int[5];

        // Assign values to individual elements using 0-based indexing
        lotteryNumbers[0] = 5;
        lotteryNumbers[1] = 9;
        lotteryNumbers[2] = 12;
        lotteryNumbers[3] = 18;
        lotteryNumbers[4] = 20;

        // Iterate through the 1D array using an Enhanced For-Loop (for-each loop)
        for (int lotteryNumber : lotteryNumbers) {
            System.out.println(lotteryNumber);
        }

        // ==========================================
        // 2. Two-Dimensional (2D) Array Example
        // ==========================================

        // Declare and initialize a 2D array (array of arrays / matrix) using array literal syntax.
        // Represents 6 rows and 5 columns (6 weeks of 5 lottery numbers each).
        int[][] weeklyLotteryNumbers = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
                { 26, 27, 28, 29, 30 }
        };

        // Traverse the 2D array using Nested For-Loops
        // Outer loop iterates through each row (weeklyLotteryNumbers.length = number of rows)
        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            // Inner loop iterates through each element/column in row 'i' (weeklyLotteryNumbers[i].length)
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                // Print each element followed by a tab (\t) character
                System.out.print(weeklyLotteryNumbers[i][j] + "\t");
            }
        }
        System.out.println();
    }

}

