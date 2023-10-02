//Problem 1: Simple While Loop
     //Write a program that uses a `while` loop to print numbers from 1 to 5.

package com.java.assign04;

public class WhileLoopExample {
    public static void main(String[] args) {
        int number = 1; // Initialize a variable to store the current number

        while (number <= 5) { // Using a while loop to iterate from 1 to 5
            System.out.println(number); // Print the current number
            number++; // Increment the number by 1 for the next iteration
        }
    }
}
