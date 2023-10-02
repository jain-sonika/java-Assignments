//Problem 2: Array Sum and Average
//Create an array of integers in Java.
// Calculate and print the sum of all the elements in the array.
// Then, calculate and print the average of the elements.

package com.java.assign2.assign9;

public class ArraySumAndAvg {
    public static void main(String[] args) {


        int[] number = new int[]{2, 3, 5, 7, 5, 6};

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];


        }
        System.out.println(sum);
        int avg = sum/2;
        System.out.println(avg);

    }
}