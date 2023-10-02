//Problem 4: Break Statement
//Modify the previous program with a `while` loop to
// stop asking for numbers if the user enters a negative number.
// Calculate and print the sum of all non-negative numbers entered.


package com.java.assign04;
import java.util.*;
public class SumNonNegativeNumbersWithWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Enter a number (negative number to exit): ");
            number = scanner.nextInt();
            if (number < 0) {
                break; // Exit the loop if a negative number is entered
            }

            sum = sum + number;
        }

        scanner.close();

        System.out.println("Sum of non-negative numbers entered: " + sum);
    }
}








