//Problem 3: Implement a function that reverses a given string and returns the reversed string.

package com.java.assign8;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcd";
        String rev = reverse(s);
        System.out.println(rev);
    }
    public static String reverse(String s){
        String res ="";
        for(int i = s.length()-1 ; i>=0 ; i--){
            res = res +s.charAt(i);
        }
        return res ;

    }
}
