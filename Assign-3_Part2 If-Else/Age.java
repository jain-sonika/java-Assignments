//Problem 1: Simple If-Else Statement
//Write a program that asks the user for their age using `Scanner`.
// If the age is greater than or equal to 18, print "You are an adult."
// Otherwise, print "You are a minor."

package com.java.assign03;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        scanner.close();
    }
}
