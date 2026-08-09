package com.beginner.datatypes.objects;

public class ObjectReferenceApp {
    public static void main(String[] args) {
        // -------------------------------------------------------------
        // OBJECT REFERENCE TYPES & WRAPPER CLASSES IN JAVA
        // -------------------------------------------------------------
        // Wrapper classes encapsulate primitive values into objects on the heap.
        // Autoboxing automatically converts primitives to their wrapper object
        // equivalents.
        // Unlike primitives, object references can hold 'null' values.

        // 1. Byte: Wrapper object for byte (-128 to 127)
        Byte numberOfSeats = 5;

        // 2. Short: Wrapper object for short (-32,768 to 32,767)
        Short horsePower = 392;

        // 3. Integer: Wrapper object for int (32-bit signed integer wrapper)
        Integer price = 14999;

        // 4. Long: Wrapper object for long (64-bit integer, requires 'L' or 'l' suffix)
        Long registrationNumber = 234523452345L;

        // 5. Float: Wrapper object for float (single-precision 32-bit floating point,
        // requires 'F' or 'f' suffix)
        Float fuelConsumptionCombined = 15.5F;

        // 6. Double: Wrapper object for double (double-precision 64-bit floating point)
        Double fuelConsumptionPrecise = 1.523452353245654e1;

        // 7. Boolean: Wrapper object for boolean (stores true, false, or null)
        Boolean isDamaged = true;

        // 8. Character: Wrapper object for char (16-bit Unicode character)
        Character energyEfficiencyCategory = 'G';

        // 9. String: Object reference representing a sequence of characters
        String carModel = "Dodge Challenger SRT 392";
        String carModelNew = new String("Dodge Challenger SRT 392");

        // -------------------------------------------------------------
        // OUTPUT VEHICLE SPECIFICATIONS
        // -------------------------------------------------------------
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horse power: " + horsePower + " hp");
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Fuel consumption combined: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Fuel consumption precise: " + fuelConsumptionPrecise.intValue() + " l/100km");
        System.out.println("Is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("Car model: " + carModel);
        System.out.println("Car model with uppercase: " + carModel.toUpperCase());
        System.out.println("Car model with lowercase: " + carModel.toLowerCase());
        System.out.println("Car model and car model with new keyword are equal: " + carModel.equals(carModelNew));
    }
}
