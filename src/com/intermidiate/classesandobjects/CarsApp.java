package com.intermidiate.classesandobjects;

/**
 * Main application class demonstrating object creation (instantiation)
 * and method calls using the {@link DodgeChallenger} class.
 */
public class CarsApp {

    /**
     * The entry point of the Java application.
     *
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        // Instantiate the first DodgeChallenger object (red car)
        // Explicit casts like (byte) 3 and (short) 500 are required because integer literals in Java default to 'int'
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte) 3, (short) 500,
                (short) 500, (short) 7000, (int) 35000, (int) 5000, false);
        
        // Display attributes and simulate engine start for the red car
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();

        System.out.println("-----------------------------------------");

        // Instantiate the second DodgeChallenger object (orange car) with distinct state values
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte) 1, (short) 392,
                (short) 492, (short) 6700, (int) 30000, (int) 10000, false);
        
        // Display attributes and simulate engine start for the orange car
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();
    }

}

