/*
 * Check if a number is Automorphic Number
Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Examples:

Example 1:
Input Format: N = 76
Result: Automorphic Number
Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

Input Format: 25
Result: Automorphic Number
Explanation: Calculating 25 * 25 gives 625, it ends with the given number.
 */

import java.util.*;

public class AutomorphicNumber{
    public static boolean printSolution(int n){
        int sqNumber = n*n;
        while(n != 0){
            if(n%10 != sqNumber%10){
                return false;
            }

            n = n/10;
            sqNumber = sqNumber/10;
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        boolean result = printSolution(n);
        if(result){
            System.out.println("It is a automorphic number");
        }else{
            System.out.println("It is not an automorphic number");
        }
    }
}