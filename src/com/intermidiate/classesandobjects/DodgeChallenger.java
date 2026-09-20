package com.intermidiate.classesandobjects;

import java.util.Random;

/**
 * Represents a Dodge Challenger car.
 * This class serves as a blueprint for DodgeChallenger objects, demonstrating
 * object-oriented concepts such as instance variables (fields), constructors, 
 * methods, and various primitive and reference data types in Java.
 */
public class DodgeChallenger {

    // --- Instance Variables / Fields ---

    // Byte data types (8-bit signed integer)
    byte numberOfSeats = 5;
    byte numberofDoors = 3;
    byte numberofVehicleOwners = 1;
    byte emissionSticker = 4;

    // Short data types (16-bit signed integer)
    short power = 362;
    short horsePower = 492;
    short co2Emission = 333;
    short cubicCapacity = 6417;

    // Integer data types (32-bit signed integer)
    int price = 29999;
    int mileage = 14999;

    // Long data type (64-bit signed integer, denoted by 'L' suffix)
    long registrationNumber = 23452345232352345L;

    // Single-precision floating-point numbers (float: 32-bit, denoted by 'F' suffix)
    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;
    float fuelConsumptionExtraUrban = 13.6F;

    // Double-precision floating-point number (double: 64-bit, e1 scientific notation = 15.234...)
    double fuelConsumptionPreciseAverage = 1.5234523534656456e1;

    // Boolean data type (true or false)
    boolean isDamaged = true;

    // Character data type (char: single 16-bit Unicode character in single quotes)
    char energyEfficiencyCategory = 'G';

    // Reference data type (String: sequence of characters)
    String color;

    /**
     * Constructs a new DodgeChallenger object with custom attributes.
     *
     * @param color                 The exterior color of the car
     * @param numberofVehicleOwners The number of previous vehicle owners
     * @param power                 Engine power output in kW
     * @param horsePower            Engine power output in horsepower (hp)
     * @param cubicCapacity         Engine displacement in cubic centimeters (ccm)
     * @param price                 The price of the vehicle in euros
     * @param mileage               The total distance driven in kilometers
     * @param isDamaged             Flag indicating whether the vehicle has damage
     */
    DodgeChallenger(String color, byte numberofVehicleOwners, short power, short horsePower,
            short cubicCapacity, int price, int mileage, boolean isDamaged) {
        // Assign constructor parameters to instance fields using 'this' keyword
        this.color = color;
        this.numberofVehicleOwners = numberofVehicleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.mileage = mileage;
        this.isDamaged = isDamaged;

        // Generate a random long integer for the registration number
        Random randomNumberGenerator = new Random();
        this.registrationNumber = randomNumberGenerator.nextLong();
    }

    /**
     * Simulates starting the engine of the Dodge Challenger.
     */
    public void startTheEngine() {
        System.out.println("The engine is started.");
    }

    /**
     * Prints a detailed specification list and current status of the car to the console.
     */
    public void getDescription() {
        System.out.println("A " + color + " Dodge Challanger is created.");
        System.out.println("Price: " + price + " euros");
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Is damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + " ccm");
        System.out.println("Power: " + power + " kW (" + horsePower + " hp)");
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        System.out.println("Emission sticker: " + emissionSticker + " (Energy efficiency category: "
                + energyEfficiencyCategory + ")");
        System.out.println("Fuel consumption combined: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Fuel consumption urban: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Fuel consumption extra urban: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Fuel consumption precise average: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of vehicle owners: " + numberofVehicleOwners);
        System.out.println("Number of doors: " + numberofDoors);
        System.out.println("Number of seats: " + numberOfSeats);
    }

}

