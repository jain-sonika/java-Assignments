//Problem 3: Simple Do-While Loop
//Write a program that uses a `do-while` loop to repeatedly
// ask the user for a number until they enter 0. After the loop,
// print the sum of all the entered numbers.

package com.java.assign04;

import java.util.*;
public class SumNumbersWithDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (0 to exit): ");
            number = scanner.nextInt();

            sum = sum + number;
        } while (number != 0);

        scanner.close();

        System.out.println("Sum of entered numbers: " + sum);
    }
}
