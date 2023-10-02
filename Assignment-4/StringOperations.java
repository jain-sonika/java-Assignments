//4. Problem: String Reversal with Palindrome Check

package com.java.assign4;

import java.util.Scanner;

public class StringOperations {

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);


        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }


    }
}
