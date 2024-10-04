/*
 * Permutations in which N people can occupy R seats
Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

Examples:

Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Example 2:
Input: N=6,r = 4.
Output: 360
 */

import java.util.*;
public class Permutation {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n*factorial(n-1);
    }

    public static int printSolution(int n, int r){
        int numerator = factorial(n);
        int denominator = factorial(n-r);

        return (numerator/denominator);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();


        System.out.println(printSolution(n, r));
    }
}
