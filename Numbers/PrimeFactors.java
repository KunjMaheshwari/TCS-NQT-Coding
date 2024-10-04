/*
 * Print all Prime Factors of the given number
Problem Statement: Given an integer N, print all of its prime factors.

Examples
Example 1:
Input: N=60
Output: 2, 3, 5
Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
Example 2:
Input: N=35
Output: 5, 7
Explanation: All factors/divisors of 35 include: 1, 5, 7, 35. Out of these, only 5 and 7 are prime.
 */

 import java.util.*;

 public class PrimeFactors {
     
     // Function to check if a number is prime
     public static boolean isPrime(int n) {
         if (n <= 1) {
             return false; // 1 and below are not prime
         }
         if (n == 2) {
             return true; // 2 is a prime number
         }
         // Check divisibility from 2 to sqrt(n)
         for (int i = 2; i <= Math.sqrt(n); i++) {
             if (n % i == 0) {
                 return false; // Divisible by i, hence not prime
             }
         }
         return true; // Prime if no divisors found
     }
 
     // Function to print all prime factors of a number
     public static void printPrimeFactors(int n) {
         for (int i = 2; i <= n; i++) {
             // Check if i is a divisor of n
             if (n % i == 0) {
                 // Check if the divisor i is prime
                 if (isPrime(i)) {
                     System.out.print(i + " ");
                 }
             }
         }
         System.out.println();
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // Input the number for which to find prime factors
         int n = sc.nextInt();
         
         // Print the prime factors of the number
         printPrimeFactors(n);
 
         sc.close();
     }
 }
 