//Problem 2: If-Else If-Else Block
//Create a program that takes an integer input from the user
// and determines if it's positive, negative, or zero. Display an appropriate message.



package com.java.assign03;
import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
