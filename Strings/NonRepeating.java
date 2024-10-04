/*
 * Find Non-repeating characters of a String
Problem:  Given a string, print non-repeating characters of the string.

Examples:

Example 1:
Input: string = “google”
Output: l,e

Explanation: Non repeating characters are l,e.

Example 2:
Input: string = “yahoo”
Output: y,a,h
Explanation: Non repeating characters are y,a,h
 */

import java.util.*;

public class NonRepeating{
    public static void printSolution(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() ==1 ){
                sb.append(entry.getKey()).append(", ");
            }
        }

        System.out.println(sb.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSolution(str);
    }
}