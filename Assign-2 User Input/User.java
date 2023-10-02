/*Q) Write a program in java that -
1) Prompts the user to enter their name, age, and whether they are a student or not.
2) It then reads the input using the Scanner class with appropriate data types (String, int, and boolean).
3) Based on the user's age, it determines if they are an adult or a minor, and based on their student
 status, it provides a relevant message. (eg: You are eligible to be a student etc).
        Note: Try to use your own method / functions to print messages.*/

package com.java.assign2;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine();

        printUser(name , age , isStudent );

    }

    public static void printUser(String name, int age, boolean isStudent) {
        System.out.println("User :");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        if (isStudent) {
            System.out.println("You are eligible to be a student.");
        } else {
            System.out.println("You are not eligible to be a student.");
        }
    }
}

