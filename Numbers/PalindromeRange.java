/*
 * Find all Palindrome Numbers in a given range
 * Problem Statement: Given a range of numbers, find all the palindrome numbers
 * in the range.
 * 
 * Note: A palindromic number is a number that remains the same when its digits
 * are reversed.OR a palindrome is a number that reads the same forward and
 * backward Eg: 121,1221, 2552
 * 
 * Examples:
 * 
 * Example 1:
 * Input: min = 10 , max = 50
 * Output: 11 22 33 44
 * Explanation: 11, 22, 33, 44 will remain the same when they read from forward
 * or backward.
 * 
 * Example2:
 * Input: min = 100 , max = 150
 * Output: 101 111 121 131 141
 * Explanation: 11, 22, 33, 44 will remain the same when they read from forward
 * or backward.
 */

 import java.util.*;

 public class PalindromeRange {
 
     // Method to check if a number is a palindrome
     public static boolean isPalindrome(int number) {
         int originalNumber = number;
         int reversedNumber = 0;
 
         while (number > 0) {
             int lastDigit = number % 10;
             reversedNumber = reversedNumber * 10 + lastDigit;
             number = number / 10;
         }
 
         return reversedNumber == originalNumber;
     }
 
     // Method to find and return all palindromes in the given range
     public static List<Integer> printAllPalindrome(int min, int max) {
         List<Integer> palindromes = new ArrayList<>();
 
         for (int i = min; i <= max; i++) {
             if (isPalindrome(i)) {
                 palindromes.add(i);
             }
         }
         return palindromes;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input the range
         int min = sc.nextInt();
         int max = sc.nextInt();
 
         // Get the list of palindrome numbers in the range
         List<Integer> result = printAllPalindrome(min, max);
 
         // Print the palindrome numbers
         for (int num : result) {
             System.out.print(num + " ");
         }
 
         sc.close();  // Close the scanner
     }
 }
 