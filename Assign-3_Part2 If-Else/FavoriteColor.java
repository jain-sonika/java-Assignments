//Problem 4: Comparing Strings
//Ask the user to enter their favorite color using `Scanner`.
// If the input is "blue," print "Blue is a cool color."
// Otherwise, print "Your favorite color is nice too!"


package com.java.assign03;
import java.util.*;
public class FavoriteColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your favorite color: ");
        String favoriteColor = scanner.nextLine(); 

        if (favoriteColor.equals("blue")) {
            System.out.println("Blue is a cool color.");
        } else {
            System.out.println("Your favorite color is nice too!");
        }

        scanner.close();
    }

}
