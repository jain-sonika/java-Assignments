//Problem 1: Swapping Two Numbers

package com.java.assign5;

 import java.util.Scanner;

    public class SwapNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            swapNumbers(a, b);

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            scanner.close();
        }

        public static void swapNumbers(int x, int y) {
            int temp = x;
            x = y;
            y = temp;
        }
    }




