/*
Problem Statement: Given two numbers. Find the greatest of two numbers.

Examples:

Example 1:
Input: 1 3
Output: 3
Explanation: Answer is 3,since 3 is greater than 1.

Input: 1.123  1.124
Output: 1.124
Explanation: Answer is 1.124,since 1.124 is greater than 1.123.
 */
import java.util.*;

public class GreatestNumber {
    public static int printGreatest(int n1, int n2){
        return Math.max(n1, n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        System.out.println(printGreatest(n1, n2));
        sc.close();
    }
}
