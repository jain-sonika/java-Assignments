//3. Problem: Array Operations

package com.java.assign4;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }


        int sum = 0;
        for (int num : arr) {
            sum += num;//sum= sum+num;
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double average = (double) sum / size;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Average of all elements: " + average);

        scanner.close();
    }
}



