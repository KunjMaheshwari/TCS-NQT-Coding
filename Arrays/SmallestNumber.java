/*
 * Find the smallest element in an array


138

0
Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
 */

import java.util.*;

public class SmallestNumber{
    public static int printSmallest(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(printSmallest(arr));
        sc.close();
    }
}