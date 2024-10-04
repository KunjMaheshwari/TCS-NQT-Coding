/*
 * Calculate Sum of the Elements of the Array
Problem Statement: Given an array, we have to find the sum of all the elements in the array.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 11
Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
 */


public class SumofElements{
    public static int printSum(int arr[]){
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
        }
        return currSum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        System.out.println(printSum(arr));
    }
}