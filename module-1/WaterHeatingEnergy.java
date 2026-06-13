/*
 * Sheridan Dela Cruz
 * June 5, 2026
 * Module 1.3
 *
 * Program Name: Water Heating Energy Calculator
 * Description:
 *   This program calculates the amount of energy (Q) needed to heat water
 *   from an initial temperature to a final temperature.
 *
 */

import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for the mass of the water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Ask user for the initial temperature in Celsius
        System.out.print("Enter the initial temperature (°C): ");
        double initialTemperature = input.nextDouble();

        // Ask user for the final temperature in Celsius
        System.out.print("Enter the final temperature (°C): ");
        double finalTemperature = input.nextDouble();

        // Apply the formula: Q = waterMass * (final - initial) * 4184
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + Q + " joules.");
    }
}
