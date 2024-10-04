/*
 * Find all repeating elements in an array
Problem Statement: Find all the repeating elements present in an array.

Examples:

Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
 Arr[] = [1,1,0]
Output:
 1
Explanation:
 Only 1 is occurring more than once in the given array.
 */

import java.util.*;

public class RepeatingElements{
    public static void printRepeating(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,3,4,4,5,2};
        
        printRepeating(arr);
    }
}