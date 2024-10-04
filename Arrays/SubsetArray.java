/*
 * Check if array is subset of another array.
 * 
 * Write a program to find whether an array is a subset of another array or not.
 * 
 * Given arr1[] and arr2[], we need to find whether arr1[] is a subset of
 * arr2[]. An array is called a subset of another if all of its elements are
 * present in the other array.
 * 
 * Note: Array elements are assumed to be unique.
 * 
 * Examples:
 * 
 * Example 1:
 * Input: arr1[]= [1,3,4,5,2]
 * arr2[]= [2,4,3,1,7,5,15]
 * Output: arr1[] is a subset of arr2[]
 * 
 * Example 2:
 * Input: arr1[]= [1,3,4,5,2]
 * arr2[]= [4,5,2]
 * Output: arr1[] is not a subset of arr2[]
 * 
 * Example 3:
 * Input: arr1[]= [1,3,4,5,2]
 * arr2[]= [11,12,13,15,16]
 * Output: arr1[] is not a subset of arr2[]
 */

import java.util.*;

public class SubsetArray{
    public static void isSubset(int arr1[], int arr2[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean isSubsetvalid = false;

        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i], map.getOrDefault(arr2[i], 0)+1);
        }

        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                isSubsetvalid = true;
            }
        }

        if(isSubsetvalid == true){
            System.out.println("arr1 is a subset of arr2");
        }else{
            System.out.println("arr1 is not a subset of arr2");
        }
    }
    public static void main(String args[]){
        int arr1[]= {1,3,4,5,2};
        int arr2[]= {11,12,13,15,16};


        isSubset(arr1, arr2);
    }
}


