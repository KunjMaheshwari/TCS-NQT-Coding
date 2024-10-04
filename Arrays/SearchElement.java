/*
 * Search an Element in an Array : Program CPP Java
Problem Statement: Search an element in an array and return its position

Examples:

Example 1:
Input: array[] = {1,2,3,4,5} k=3                                                                              Output: 2                                                                                                              Explanation: The answer is 2 because 3 is present at 2nd index.

Example 2:
Input: array[]={6,7,9,5,3,10} k=10
Output: 5
Explanation: The answer is 5 because 10 is present at 5th index.
 */

import java.util.*;

public class SearchElement {
    public static int printsearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        System.out.println(printsearch(arr, key));


        sc.close();

    }
}
