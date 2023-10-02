//Problem 3: Logical Operators
//Write a program that prompts the user for a number.
// Check if the number is both even and greater than 10.
// If both conditions are met, print "The number is even and greater than 10."


package com.java.assign03;
import java.util.*;
public class EvenAndGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && number > 10) {
            System.out.println("The number is even and greater than 10.");
        } else {
            System.out.println("The number does not meet both conditions.");
        }

        scanner.close();
    }
}
