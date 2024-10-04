/*

Problem Statement: Check if the given year is a leap year or not.

Examples:

Example 1:
Input: 1996
Output: Yes
Explanation: Since 1996 is a leap year answer is “Yes”.

Example 2:
Input: 2000
Output: Yes

Explanation: Since 2000 is a leap year answer is “Yes”.
 */

import java.util.*;

public class LeapYear{
    public static boolean printSolution(int n){
        if((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0))){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(printSolution(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}

// Concept -> If a number is divisible by 400 OR a number is divisible by 4 AND not by 100 then it is a leap year number.