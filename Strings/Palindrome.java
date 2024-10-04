/*
 * Check if the given String is Palindrome or not
Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
 */

import java.util.*;

public class Palindrome{
    public static boolean isPalindrome(String str){
        String newStr = str.replace("\\s", "").toLowerCase();

        String reversedString = new StringBuilder(str).reverse().toString();

        return reversedString.equals(newStr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        if(isPalindrome(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}