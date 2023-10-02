//Problem 2: Create a method that accepts a list of numbers and returns the largest number
// in the list.



package com.java.assign8;

public class FindLargestNumber {
    public static void main(String[] args) {
        int arr[] = {5 , 6 , 3 , 8 , 2 , 9};
        int m = maxElement(arr);
        System.out.println(m);
    }


    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
            }
        }
        return max;
    }
}