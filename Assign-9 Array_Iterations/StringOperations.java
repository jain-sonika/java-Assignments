//Problem 1: String Manipulation
//Write a Java program that takes a user input string and then performs the following operations:
//Print the length of the string.
//Convert the string to uppercase and print it.
//Check if the string contains the word "Java"
// (case-insensitive) and print "Contains 'Java'" or "Does not contain 'Java'" accordingly.


package com.java.assign2.assign9;
import java.util.*;
public class StringOperations {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String inputstring = sc.nextLine();

        int length = inputstring.length();
        System.out.println("Length of the string :" + length);

        String uppercaseString = inputstring.toUpperCase();
        System.out.println("uppercase of the string :" + uppercaseString);

        if(inputstring.toLowerCase().contains("java")){
            System.out.println("java");
        }else{
            System.out.println("not contains java");
        }


}
}
