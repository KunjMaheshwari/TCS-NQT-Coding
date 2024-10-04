/*
 * Reverse digits of a number
Problem Statement: Given an integer. Write a program to reverse digits of a number.

Examples:

Example 1:
Input: N = 472
Output: 274
Explanation: Reading the number from back to front, we see that the output should be 274

Example 2:
Input: N = 470
Output: 74
Explanation: Reading the number from back to front, we get 074. For an integer with no decimals, we know that leading zeros have no significance and therefore our answer should be 74
 */

import java.util.*;

public class ReverseDigits{
    public static int printSolution(int n){
        int d = 0;
        int rev = 0;
        while(n != 0){
            d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(printSolution(n));
        sc.close();
    }
}