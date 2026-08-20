package com.beginner.methods;

/**
 * FunctionApp demonstrates basic concepts and usage of Java Methods (Functions):
 * - Void methods vs. Methods that return values
 * - Methods without parameters vs. Methods with parameters
 * - Execution control flow (loops, switch-case statements) inside methods
 * - Method Overloading (same method name, different parameter types/signatures)
 */
public class FunctionApp {

    public static void main(String[] args) {
        // Calling a simple void method without parameters
        sayHello();

        // Calling a void method and passing an argument (5 repetitions)
        blackboardPunishment(5);

        // Calling a method that returns a double value and printing the result
        System.out.println("The price with 10% off: " + getTenPercentOffDiscountPrice(20000));

        // Calling a parameterized discount method (int price, int percent)
        System.out.println("The price with 50% off: " + getDiscountPrice(20000, 50));

        // Calling an overloaded discount method (double price, int percent)
        System.out.println("The price with 40% off: " + getDiscountPrice(20000.55, 60));

        // Calling a method with a char parameter that uses a switch statement
        getEnergyEfficiency('A');
    }

    /**
     * Simple static method with no input parameters and no return value (void).
     * Prints "Hello" to the console.
     */
    static void sayHello() {
        System.out.println("Hello");
    }

    /**
     * Method with an integer parameter that executes a for loop.
     * 
     * @param repeatNumber The number of times to print the line.
     */
    static void blackboardPunishment(int repeatNumber) {
        for (int i = 1; i <= repeatNumber; i++) {
            System.out.println("I will not throw paper airplanes in class");
        }
    }

    /**
     * Method that takes an integer price and returns the price after a fixed 10%
     * discount.
     * 
     * @param price The original price as an integer.
     * @return The final price after 10% discount as a double (price * 0.9).
     */
    static double getTenPercentOffDiscountPrice(int price) {
        return price * 0.9;
    }

    /**
     * Method with multiple parameters to calculate price.
     * 
     * @param price   The original price as an integer.
     * @param percent The percentage factor.
     * @return The calculated price value as a double.
     */
    static double getDiscountPrice(int price, int percent) {
        return price * percent / 100.0;
    }

    /**
     * Overloaded version of getDiscountPrice that accepts a double price.
     * Demonstrates Method Overloading (same method name, different parameter
     * types).
     * 
     * @param price   The original price as a double.
     * @param percent The percentage factor.
     * @return The calculated price value as a double.
     */
    static double getDiscountPrice(double price, int percent) {
        return price * percent / 100;
    }

    /**
     * Method that evaluates a char category ('A'-'E' or 'a'-'e') and prints the energy efficiency level.
     * Demonstrates using a switch statement inside a method with case fall-through for case-insensitive matching.
     * 
     * @param category Character representing the energy rating ('A' to 'E').
     */
    static void getEnergyEfficiency(char category) {
        switch (category) {
            case 'A':
            case 'a': // Case fall-through handles both uppercase 'A' and lowercase 'a'
                System.out.println("High Efficiency");
                break;
            case 'B':
            case 'b': // Case fall-through handles both uppercase 'B' and lowercase 'b'
                System.out.println("Average Efficiency");
                break;
            case 'C':
            case 'c': // Case fall-through handles both uppercase 'C' and lowercase 'c'
                System.out.println("Low Efficiency");
                break;
            case 'D':
            case 'd': // Case fall-through handles both uppercase 'D' and lowercase 'd'
                System.out.println("Very Low Efficiency");
                break;
            case 'E':
            case 'e': // Case fall-through handles both uppercase 'E' and lowercase 'e'
                System.out.println("Minimal Efficiency");
                break;
            default: // Handles invalid or unrecognized rating characters
                System.out.println("Unknown Category");
                break;
        }
    }

}

