//Problem 4: Write a program that uses a list to store user names.
// Implement a method to add a new name to the list, and another method
// to check if a given name exists in the list. If the name exists, return "Name found,"
// otherwise return "Name not found."



package com.java.assign8;

public class UserNameList {
    public static void main(String[] args) {
        String[] arr = {"jack", "jam" ,"joel"};
        System.out.println(check(arr , "joel"));
        add(arr,"Saloni");

    }
    public static void add(String [] arr , String newName) {
        int len = arr.length + 1;
        System.out.println("new length: "+len+ "given length: "+arr.length);
        String [] ans = new String [len];
        for(int i=0 ; i < arr.length ; i++){
            ans[i] = arr[i];
        }
        ans[len-1] = newName;
        for(int i=0 ; i<ans.length;i++){
            System.out.print(ans[i]+ "  ");
        }

    }
    public static String check(String[] names_list , String name){

        for(int i =0; i<names_list.length  ; i++){
            System.out.println(i);
            if(names_list[i].equals(name))
                return "Name found";
        }
        return "Name not found";
    }
}
