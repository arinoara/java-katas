package org.aritana;

import java.util.Scanner;
/**
 * Problem 1022 - TDA Rational
 *
 * Category: Data Structures and Libraries
 * Platform: Beecrowd
 * Problem URL: https://judge.beecrowd.com/en/problems/view/1022
 *
 * OBJECTIVE:
 * Implement arithmetic operations between two fractions using
 * integer numerators and denominators.
 *
 * SUPPORTED OPERATIONS:
 * - Addition (+)
 * - Subtraction (-)
 * - Multiplication (*)
 * - Division (/)
 *
 * INPUT:
 * The first line contains the number of test cases.
 * Each test case consists of two fractions and a mathematical operator.
 *
 * PROCESSING:
 * 1. Read the numerators, denominators, and operator.
 * 2. Perform the corresponding arithmetic operation.
 * 3. Calculate the resulting fraction without simplifying it.
 * 4. Simplify the resulting fraction using the GCD
 *    (Greatest Common Divisor).
 *
 * FRACTION SIMPLIFICATION:
 * Use the Euclidean algorithm to calculate the GCD of the numerator
 * and denominator. Then divide both values by the GCD to obtain
 * the fraction in its simplest form.
 *
 * OUTPUT:
 * Display the resulting fraction before and after simplification,
 * following this format:
 *
 * numerator/denominator = simplified_numerator/simplified_denominator
 *
 * CONCEPTS PRACTICED:
 * - Arithmetic operations with fractions.
 * - Conditional statements (switch).
 * - Loop structures (for).
 * - Input handling with Scanner.
 * - Methods and code reusability.
 * - Euclidean algorithm (GCD).
 * - Integer data types and type casting to long to prevent overflow.
 *
 * TIME COMPLEXITY:
 * The Euclidean algorithm has a time complexity of
 * O(log(min(|numerator|, |denominator|))).
 *
 * @see https://judge.beecrowd.com/en/problems/index/4
 */

public class TDARational {
    public static void main(String[] args) {


        int N1;
        int D1;
        int N2;
        int D2;
        String operation;
        long responseNumerator;
        long responseDenominator;


        Scanner scanner = new Scanner(System.in);

        //1 - Number of cases
        int amountOfCases = scanner.nextInt();

        for (int i = 0; i < amountOfCases; i++) {
            //2 -  Read each expression: numerator, denominator and second fraction

            N1 = scanner.nextInt();
            scanner.next(); //consume the next divider operator
            D1 = scanner.nextInt();

            operation = scanner.next();

            N2 = scanner.nextInt();
            scanner.next(); //consume the next divider operator
            D2 = scanner.nextInt();

            //3 -  Perform the mathematical operation
            switch (operation) {
                case "+" -> {
                    responseNumerator = (long) N1 * D2 + (long) N2 * D1;
                    responseDenominator = (long) D1 * D2;
                }
                case "-" -> {
                    responseNumerator = (long) N1 * D2 - (long) N2 * D1;
                    responseDenominator = (long) D1 * D2;
                }
                case "*" -> {
                    responseNumerator = (long) N1 * N2;
                    responseDenominator = (long) D1 * D2;
                }
                case "/" -> {
                    responseNumerator = (long) N1 * D2;
                    responseDenominator = (long) N2 * D1;
                }
                default -> throw new IllegalArgumentException("Invalid Operation");
            }

            //4 - Simplify the fraction
            long greatestCommomDivsior = gcd(responseNumerator, responseDenominator);

            //5 show the results
            System.out.println(responseNumerator + "/" + responseDenominator + " = " + responseNumerator / greatestCommomDivsior
                    + "/" + responseDenominator / greatestCommomDivsior);

            amountOfCases--;
        }
        scanner.close();
    }

    public static long gcd(long numerator, long denominator) {
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        while (denominator != 0) {
            long rest = numerator % denominator;
            numerator = denominator;
            denominator = rest;
        }
        return numerator;
    }
}