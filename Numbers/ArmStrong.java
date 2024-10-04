/*
 * Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Examples
Example 1:
Input:N = 153
Output:True
Explanation: 13+53+33 = 1 + 125 + 27 = 153
Example 2:
Input:N = 371
Output: True
Explanation: 33+53+13 = 27 + 343 + 1 = 371
 */

import java.util.*;
public class ArmStrong {
    public static boolean checkArmStrong(int n){
        int originalNumber = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length();
        while(n > 0){
            int lastDigit = n %10;
            sum += Math.pow(lastDigit, numberOfDigits);
            n = n/10;
        }
        return sum == originalNumber;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();

        System.out.println(checkArmStrong(n));

        sc.close();

    }
}
