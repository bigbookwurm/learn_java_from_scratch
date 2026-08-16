package com.beginner.controlflow;

/**
 * ControlFlowApp demonstrates core Java control flow mechanisms including:
 * - Simple if-else statements (binary decision making)
 * - else-if chains (multi-branch conditional checking with String comparison)
 * - switch-case statements (evaluating discrete primitive values with break and default)
 */
public class ControlFlowApp {
    public static void main(String[] args) {

        // Variable declarations used as evaluation conditions for control flow
        boolean isDamaged = false;
        String carColor = "purple";
        char energyEfficiencyCategory = 'A';

        // 1. Simple boolean IF-ELSE statement
        // Evaluates a single boolean condition: if true, executes the 'if' block; otherwise, executes 'else'.
        if (isDamaged) {
            System.out.println("Damaged car");
        } else {
            System.out.println("Accident free car");
        }

        // 2. Multi-branch IF - ELSE IF - ELSE ladder
        // Evaluates conditions sequentially from top to bottom until one evaluates to true.
        // Uses String.equals() to compare text content rather than reference equality (==).
        if (carColor.equals("red")) {
            System.out.println("This car is red");
        } else if (carColor.equals("green")) {
            System.out.println("This car is green");
        } else if (carColor.equals("blue")) {
            System.out.println("This car is blue");
        } else {
            // Default block executed if none of the specific color conditions match
            System.out.println("I have no idea what color this car is.");
        }

        // 3. SWITCH statement
        // Evaluates a variable against specific matching case values.
        switch (energyEfficiencyCategory) {
            case 'A':
                System.out.println("This car is very energy efficient");
                break; // 'break' exits the switch statement and prevents fall-through to subsequent cases
            case 'B':
                System.out.println("This car is energy efficient");
                break;
            case 'C':
                System.out.println("This car is moderately energy efficient");
                break;
            case 'D':
                System.out.println("This car is not very energy efficient");
                break;
            case 'E':
                System.out.println("This car is inefficient");
                break;
            case 'F':
                System.out.println("This car is very inefficient");
                break;
            case 'G':
                System.out.println("This car is extremely inefficient");
                break;
            default:
                // Catch-all block executed if energyEfficiencyCategory matches no case labels
                System.out.println("I have no idea what the energy efficiency category is.");
                break;
        }

    }

}

