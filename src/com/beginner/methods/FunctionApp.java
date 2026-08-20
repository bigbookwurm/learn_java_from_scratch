package com.beginner.methods;

/**
 * FunctionApp demonstrates basic concepts and usage of Java Methods (Functions):
 * - Void methods vs. Methods that return values
 * - Methods without parameters vs. Methods with parameters
 * - Execution control flow using loops inside methods
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
     * Method that takes an integer price and returns the price after a fixed 10% discount.
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
     * Demonstrates Method Overloading (same method name, different parameter types).
     * 
     * @param price   The original price as a double.
     * @param percent The percentage factor.
     * @return The calculated price value as a double.
     */
    static double getDiscountPrice(double price, int percent) {
        return price * percent / 100;
    }

}

