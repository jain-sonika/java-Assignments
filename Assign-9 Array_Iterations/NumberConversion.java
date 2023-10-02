//Problem 3: Type Casting and Conditional Statements
//Write a Java program that takes a user input number (a floating-point number) and does the following:
//If the number is greater than or equal to 10, cast it to an integer
// and print "Integer part: [integer value]."
//If the number is less than 10, cast it to an integer
// and print "Rounded to the nearest integer: [integer value]."

package com.java.assign2.assign9;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the floating-point number");

        double inputNumber = sc.nextDouble();

        if(inputNumber >=10){
            int integerPart = (int) inputNumber;
            System.out.println("Print integerPart" + integerPart);
        }
        else {
            int roundedNumber = (int)Math.round(inputNumber);
        }
    }

}
