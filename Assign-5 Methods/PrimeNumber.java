//Problem 3: Check if a Number is Prime

package com.java.assign5;

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            boolean isPrimeNumber = isPrime(number);

            if (isPrimeNumber) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            scanner.close();
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }


            for (int i = 2; i <= Math.sqrt(num); i++) {//math.sqrt(num) =i*i<=num
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


