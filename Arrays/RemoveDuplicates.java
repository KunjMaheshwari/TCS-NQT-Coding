/*
 * Remove Duplicates in-place from Sorted Array

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.
 */

import java.util.*;
public class RemoveDuplicates{
    public static void printArray(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(Integer key : set){
            System.out.print(key +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,2,4,5,6,6,6,7,8,10};

        printArray(arr);
    }
}