//problem 1 :- Write a function that takes two integers as input and returns their sum.
package com.java.assign8;

public class AddTwoIntegers {
    public static int add(int num1 , int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int result = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }

}
