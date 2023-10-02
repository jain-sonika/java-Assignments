//Problem 5: Modulo Operator
//Write a program that asks the user for an integer and checks
// if it's even or odd using the modulo operator (%). Display whether the number is even or odd.


        package com.java.assign04;
import java.util.*;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

}
