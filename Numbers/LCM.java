/*
 * Find LCM of two numbers
Problem Statement: Find lcm of two numbers.

Examples:

Example 1:
Input: num1 = 4,num2 = 8
Output: 8


Example 2:
Input: num1 = 3,num2 = 6
Output: 6
 */

import java.util.*;

public class LCM{
    public static int hfc(int num1, int num2){
        while(num1 > 0 && num2 > 0){
            if(num1 >  num2){
                num1 = num1%num2;
            }else{
                num2 = num2%num1;
            }
        }
        if(num1 == 0){
            return num2;
        }
        return num1;
    }
    public static int printSolution(int num1, int num2){
        int product = num1*num2;

        return (product/hfc(num1, num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(printSolution(num1, num2));
    }
}