/*
 * Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
 */

import java.util.*;

public class Median{
    public static int printMedian(int arr[]){
        Arrays.sort(arr);

        if(arr.length %2 != 0){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(printMedian(arr));

        sc.close();
    }
}