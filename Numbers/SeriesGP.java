/*
Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

a, first term
r, common ratio
n, number of terms
 Write a program to find the sum of the geometric Progression Series.

Examples:

Example 1:
Input: a=1 , r=0.5 , n=3
Output: 1.75
Explanation: The sum of given GP Series is 1.75

Example 2:
Input: a=3 , r=5 , n=2
Output: 18
Explanation: The sum of the given GP Series is 18
 */

import java.util.*;

public class SeriesGP{
    public static int printSolution(int a, int r, int n){
        int formula = (int)(a*(Math.pow(r, n)-1)/(r-1));
        return formula;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(printSolution(a, r, n));

        sc.close();
    }
}