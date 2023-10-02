//Problem 2: Finding the Maximum Element

package com.java.assign5;
import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max =  findMax(numbers);

        if (max !=numbers[0] ) {//Integer.MIN_VALUE
            System.out.println("The maximum value is: " + max);
        } else {
            System.out.println("Array is empty.");
        }

        scanner.close();
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return 0; //Integer.MIN_VALUE
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}



