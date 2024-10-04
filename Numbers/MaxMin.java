/*
Problem Statement: Given a number N, print the smallest and largest digits present in the number.

Examples:

Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.

Example 2:
Input: N = 23004
Output: Largest digit : 4
        Smallest digit : 0
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.
 */

import java.util.*;

public class MaxMin{
    public static void printSolution(int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int d = 0;

        while(n != 0){
            d = n %10;
            min = Math.min(min, d);
            max = (Math.max(d, max));
            n = n/10;
        }

        System.out.println("Maximum Number is "+ max +" and Minimum number is "+ min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printSolution(N);
        sc.close();
    }
}