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
                System.out.println("Price of a " + carModel + " is: $" + price);

                // Addition (+)
                int increasedPrice = price + 1000;
                System.out.println("The increased price of a " + carModel + " is: $" + increasedPrice);

                // Subtraction (-)
                int decreasedPrice = price - 1000;
                System.out.println("The decreased price of a " + carModel + " is: $" + decreasedPrice);

                // Multiplication (*)
                int twoCarsPrice = price * 2;
                System.out.println("The price of two " + carModel + "s is: $" + twoCarsPrice);

                // Division (/) - Integer division truncates the decimal part
                int dodgesYouCanBuy = moneyInTheBank / price;
                System.out.println("The number of " + carModel + "s you can buy is: " + dodgesYouCanBuy);

                // Modulo (%) - Calculates the remainder of division
                int moneyRemaining = moneyInTheBank % price;
                System.out.println(
                                "The money remaining after buying as many " + carModel + "s as possible is: $"
                                                + moneyRemaining);
                System.out.println("");

                // -------------------------------------------------------------
                // 2. UNARY OPERATORS (+, -, ++, --, !)
                // -------------------------------------------------------------
                int priceNegative = -14999;

                // Unary Plus (+): Indicates a positive value
                int priceNegativeWithPlusSign = +priceNegative;
                System.out.println(
                                "The price of a " + carModel + " with a plus sign is: $" + priceNegativeWithPlusSign);

                // Unary Minus (-): Negates an expression
                int priceNegativeWithMinusSign = -priceNegative;
                System.out.println(
                                "The price of a " + carModel + " with a minus sign is: $" + priceNegativeWithMinusSign);

                // Increment (++): Increases a value by 1
                int priceOneDollarIncrease = ++price;
                System.out.println("The price of a " + carModel + " after one dollar price increase is: $"
                                + priceOneDollarIncrease);

                // Decrement (--): Decreases a value by 1
                int priceOneDollarDecrease = --price;
                System.out.println("The price of a " + carModel + " after one dollar price decrease is: $"
                                + priceOneDollarDecrease);

                // Logical NOT (!): Inverts a boolean value
                System.out.println("This car is damaged: " + !isDamaged);
                System.out.println("");

                // -------------------------------------------------------------
                // 3. RELATIONAL & EQUALITY OPERATORS (==, !=, >, >=, <, <=, instanceof)
                // -------------------------------------------------------------
                // Equal to (==)
                System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));

                // Not equal to (!=)
                System.out.println("Car's price doesn't equal the money in the bank: " + (price != moneyInTheBank));

                // Greater than (>)
                System.out.println("Car's price is greater than the money in the bank: " + (price > moneyInTheBank));

                // Greater than or equal to (>=)
                System.out.println("Car's price is greater than or equal to the money in the bank: "
                                + (price >= moneyInTheBank));

                // Less than (<)
                System.out.println("Car's price is less than the money in the bank: " + (price < moneyInTheBank));

                // Less than or equal to (<=)
                System.out.println("Car's price is less than or equal to the money in the bank: "
                                + (price <= moneyInTheBank));

                // Type comparison (instanceof): Checks whether an object is an instance of a
                // specific type
                System.out.println("The carModel variable's datatype is a String: " + (carModel instanceof String));
                System.out.println("");

                // -------------------------------------------------------------
                // 4. TERNARY OPERATOR (condition ? valueIfTrue : valueIfFalse)
                // -------------------------------------------------------------
                String damagedText = isDamaged ? "The car is damaged" : "The car is not damaged";
                System.out.println(damagedText);
                System.out.println("");

                // -------------------------------------------------------------
                // 5. LOGICAL OPERATORS (||, &&, !)
                // -------------------------------------------------------------
                // Logical OR (||): Evaluates to true if at least one operand is true
                String worthSeeingText = !isDamaged || price <= 20000 ? "It's worth seeing the car"
                                : "It's not worth seeing the car";
                System.out.println(worthSeeingText);

                // Logical AND (&&): Evaluates to true only if both operands are true
                String worthRepairingText = isDamaged && price <= 10000 ? "It's worth repairing the car"
                                : "It's not worth repairing the car";
                System.out.println(worthRepairingText);
                System.out.println("");

                // -------------------------------------------------------------
                // 6. COMPOUND ASSIGNMENT OPERATORS (+=, -=, *=, /=, %=)
                // -------------------------------------------------------------
                // Add and assign (+=)
                price += 1000;
                System.out.println("Price increased: $" + price);

                // Subtract and assign (-=)
                price -= 2000;
                System.out.println("Price decreased: $" + price);

                // Multiply and assign (*=)
                price *= 2;
                System.out.println("Price doubled: $" + price);

                // Divide and assign (/=)
                price /= 2;
                System.out.println("Price halved: $" + price);

                // Modulo and assign (%=)
                price %= 10000;
                System.out.println("Price remaining after modulo 10000: $" + price);
                System.out.println("");

        }
}
