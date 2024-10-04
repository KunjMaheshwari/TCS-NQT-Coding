/*
Problem statement: Given a number n check whether it's positive or negative.

Examples:

Example 1:
Input: n=5
Output: Positive

Example2:
Input: n=-6
Output: Negative
 */

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if(n > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

        sc.close();
    }
}