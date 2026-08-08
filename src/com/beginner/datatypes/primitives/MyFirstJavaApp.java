package com.beginner.datatypes.primitives;

public class MyFirstJavaApp {
    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberofDoors = 3;
        byte numberofVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 23452345232352345L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 1.5234523534656456e1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

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
    }
}