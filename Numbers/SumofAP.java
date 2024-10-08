/*
Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

a = first term of A.P.

d= common Difference of A.P.

n= Number of Terms in  A.P.

Examples:

Example 1:
Input:
n=4
a=2
d=2
Output: 20
Explanation: 2+4+6+8 = 20

Input:
n=8
a=2
d=5
Output: 124
Explanation: -2 +3 + 8 + 13 + 18 + 23 + 28 + 33 = 124
 */


import java.util.*;

public class SumofAP{
    public static int printSolution(int n, int d, int a){
        int formula = (n*(2*a+(n-1)*d)/2);
        return formula;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(printSolution(n, d, a));

        sc.close();
    }
}