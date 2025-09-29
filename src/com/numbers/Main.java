// Java program to find numbers dividable by 3 in range 0 - 99

package com.numbers;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating array of integers
        int [] arr = new int[100];

        // Helping value
        int temporalValue = 0;

        // Filling arr with values
        for (int index = 0; index < 100; index++) {
            arr [index] = index;
        }

        // Condition and loop to iterate through
        while(temporalValue < 100) {
            if (arr [temporalValue] % 3 == 0) {

                // Printing result to console
                System.out.println( arr [temporalValue] + " can be divided by 3.");

            }
            temporalValue++;
        }

    }
}