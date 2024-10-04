/*
Problem Statement: Given a number n, check whether a given number is even or odd.

Examples:

Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.
 
Example 2:  
Input: n=6
Output: even
Explanation: 6 is divisible by 2.
 */

import java.util.*;

class EvenAndOdd{
    public static void printSolution(int n){
        if(n % 2 == 0){
            System.out.println("Number is a even number");
        }else{
            System.out.println("Number is a odd Number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSolution(n);
        sc.close();
    }
}