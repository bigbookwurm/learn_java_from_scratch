package com.beginner.datatypes.primitives;

public class MyFirstJavaApp {
    public static void main(String[] args) {
        // -------------------------------------------------------------
        // PRIMITIVE DATA TYPES IN JAVA
        // -------------------------------------------------------------

        // 1. byte: 8-bit signed integer (-128 to 127) - ideal for small numbers
        byte numberOfSeats = 5;
        byte numberofDoors = 3;
        byte numberofVehicleOwners = 1;
        byte emissionSticker = 4;

        // 2. short: 16-bit signed integer (-32,768 to 32,767)
        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        // 3. int: 32-bit signed integer - default type for whole numbers
        int price = 29999;
        int mileage = 14999;

        // 4. long: 64-bit signed integer - requires 'L' or 'l' suffix
        long registrationNumber = 23452345232352345L;

        // 5. float: 32-bit single-precision floating point - requires 'F' or 'f' suffix
        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        // 6. double: 64-bit double-precision floating point - default for decimals
        // (supports scientific notation)
        double fuelConsumptionPreciseAverage = 1.5234523534656456e1;

        // 7. boolean: Stores true or false state
        boolean isDamaged = true;

        // 8. char: Stores a single 16-bit Unicode character (enclosed in single quotes)
        char energyEfficiencyCategory = 'G';

        // -------------------------------------------------------------
        // OUTPUT VEHICLE SPECIFICATIONS
        // -------------------------------------------------------------
        System.out.println("2018 Dodge Challenger SRT 392");
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

        // -------------------------------------------------------------
        // IMPLICIT TYPE CONVERSIONS (WIDENING)
        // -------------------------------------------------------------
        System.out.println("Conversion");

        // Implicit widening conversion: byte (8-bit) to short (16-bit)
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The values of new number of seats: " + newNumberOfSeats);

        // Implicit widening conversion: float (32-bit) to double (64-bit)
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel: " + newFuelConsumptionCombined);

        // -------------------------------------------------------------
        // EXPLICIT TYPE CONVERSION (NARROWING)
        // -------------------------------------------------------------

        // Explicit narrowing conversion: int (32-bit) to byte (8-bit)
        byte newPower = (byte) power;
        System.out.println("The new value of power: " + newPower + " kW");
    }
}