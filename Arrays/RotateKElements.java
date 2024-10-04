/*
 * Rotate array by K elements : Block Swap Algorithm
In this article we will learn a very popular algorithm for "Rotate array by K elements : Block Swap Algorithm".

Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.
 */


public class RotateKElements {
    public static void printRotation(int arr[], int K){
        K = K%arr.length;

            reverse(arr, 0, arr.length-1);
            reverse(arr, 0, K-1);
            reverse(arr, K, arr.length-1);

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
    public static void reverse(int arr[], int si, int ei){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int K = 2;

        printRotation(arr, K);
        
    }
}
