package com.beginner.operators;

/**
 * Demonstrates the use of various Java operators, including:
 * - Arithmetic operators
 * - Unary operators
 * - Relational and equality operators
 * - Ternary operator
 * - Logical operators
 * - Compound assignment operators
 */
public class OperatorsApp {
    public static void main(String[] args) {

        // -------------------------------------------------------------
        // INITIAL VARIABLES
        // -------------------------------------------------------------
        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = false;

        // -------------------------------------------------------------
        // 1. ARITHMETIC OPERATORS (+, -, *, /, %)
        // -------------------------------------------------------------
        System.out.print("Price of a " + carModel + " is: $" + price + "\n");

        // Addition (+)
        int increasedPrice = price + 1000;
        System.out.print("The increased price of a " + carModel + " is: $" + increasedPrice + "\n");

        // Subtraction (-)
        int decreasedPrice = price - 1000;
        System.out.print("The decreased price of a " + carModel + " is: $" + decreasedPrice + "\n");

        // Multiplication (*)
        int twoCarsPrice = price * 2;
        System.out.print("The price of two " + carModel + "s is: $" + twoCarsPrice + "\n");

        // Division (/) - Integer division truncates the decimal part
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.print("The number of " + carModel + "s you can buy is: " + dodgesYouCanBuy + "\n");

        // Modulo (%) - Calculates the remainder of division
        int moneyRemaining = moneyInTheBank % price;
        System.out.print(
                "The money remaining after buying as many " + carModel + "s as possible is: $" + moneyRemaining + "\n");
        System.out.print("");

        // -------------------------------------------------------------
        // 2. UNARY OPERATORS (+, -, ++, --, !)
        // -------------------------------------------------------------
        int priceNegative = -14999;

        // Unary Plus (+): Indicates a positive value
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.print("The price of a " + carModel + " with a plus sign is: $" + priceNegativeWithPlusSign + "\n");

        // Unary Minus (-): Negates an expression
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.print("The price of a " + carModel + " with a minus sign is: $" + priceNegativeWithMinusSign + "\n");

        // Increment (++): Increases a value by 1
        int priceOneDollarIncrease = ++price;
        System.out.print("The price of a " + carModel + " after one dollar price increase is: $"
                + priceOneDollarIncrease + "\n");

        // Decrement (--): Decreases a value by 1
        int priceOneDollarDecrease = --price;
        System.out.print("The price of a " + carModel + " after one dollar price decrease is: $"
                + priceOneDollarDecrease + "\n");

        // Logical NOT (!): Inverts a boolean value
        System.out.print("This car is damaged: " + !isDamaged + "\n");
        System.out.print("");

        // -------------------------------------------------------------
        // 3. RELATIONAL & EQUALITY OPERATORS (==, !=, >, >=, <, <=, instanceof)
        // -------------------------------------------------------------
        // Equal to (==)
        System.out.print("Car's price equals the money in the bank: " + (price == moneyInTheBank) + "\n");

        // Not equal to (!=)
        System.out.print("Car's price doesn't equal the money in the bank: " + (price != moneyInTheBank) + "\n");

        // Greater than (>)
        System.out.print("Car's price is greater than the money in the bank: " + (price > moneyInTheBank) + "\n");

        // Greater than or equal to (>=)
        System.out.print("Car's price is greater than or equal to the money in the bank: "
                + (price >= moneyInTheBank) + "\n");

        // Less than (<)
        System.out.print("Car's price is less than the money in the bank: " + (price < moneyInTheBank) + "\n");

        // Less than or equal to (<=)
        System.out.print("Car's price is less than or equal to the money in the bank: "
                + (price <= moneyInTheBank) + "\n");

        // Type comparison (instanceof): Checks whether an object is an instance of a specific type
        System.out.print("The carModel variable's datatype is a String: " + (carModel instanceof String) + "\n");
        System.out.print("");

        // -------------------------------------------------------------
        // 4. TERNARY OPERATOR (condition ? valueIfTrue : valueIfFalse)
        // -------------------------------------------------------------
        String damagedText = isDamaged ? "The car is damaged" : "The car is not damaged";
        System.out.print(damagedText + "\n");
        System.out.print("");

        // -------------------------------------------------------------
        // 5. LOGICAL OPERATORS (||, &&, !)
        // -------------------------------------------------------------
        // Logical OR (||): Evaluates to true if at least one operand is true
        String worthSeeingText = !isDamaged || price <= 20000 ? "It's worth seeing the car"
                : "It's not worth seeing the car";
        System.out.print(worthSeeingText + "\n");

        // Logical AND (&&): Evaluates to true only if both operands are true
        String worthRepairingText = isDamaged && price <= 10000 ? "It's worth repairing the car"
                : "It's not worth repairing the car";
        System.out.print(worthRepairingText + "\n");
        System.out.print("");

        // -------------------------------------------------------------
        // 6. COMPOUND ASSIGNMENT OPERATORS (+=, -=, *=, /=, %=)
        // -------------------------------------------------------------
        // Add and assign (+=)
        price += 1000;
        System.out.print("Price increased: $" + price + "\n");

        // Subtract and assign (-=)
        price -= 2000;
        System.out.print("Price decreased: $" + price + "\n");

        // Multiply and assign (*=)
        price *= 2;
        System.out.print("Price doubled: $" + price + "\n");

        // Divide and assign (/=)
        price /= 2;
        System.out.print("Price halved: $" + price + "\n");

        // Modulo and assign (%=)
        price %= 10000;
        System.out.print("Price remaining after modulo 10000: $" + price + "\n");
        System.out.print("");

    }
}

