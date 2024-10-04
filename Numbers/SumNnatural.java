/*
 * Sum of first N Natural Numbers
Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

Examples:

Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15
 */


import java.util.*;

class SumNnatural{
    public static int printSolution(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }

        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(printSolution(n));

        sc.close();
    }
}