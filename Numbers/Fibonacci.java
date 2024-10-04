/*
Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Examples:

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
 */

import java.util.*;
public class Fibonacci {
    public static void printSolution(int n){
        int fib[] = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2;i<n;i++){
            fib[i] = fib[i-1]+ fib[i-2];
        }

        for(int i=0;i<n;i++){
            System.out.println(fib[i]+" ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSolution(n);
        sc.close();
    }
}
