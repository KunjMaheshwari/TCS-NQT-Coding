/*
 * Replace elements by its rank in the array
 * 
 * Problem Statement: Given an array of N integers, the task is to replace each
 * element of the array by its rank in the array.
 * 
 * Examples:
 * 
 * Example 1:
 * Input: 20 15 26 2 98 6
 * Output: 4 3 5 1 6 2
 * Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is
 * 1,rank of 6 is 2,rank of 15 is 3 and so…
 * 
 * Example 2:
 * Input: 1 5 8 15 8 25 9
 * Output: 1 2 3 5 3 6 4
 * Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is
 * 1,rank of 5 is 2,rank of 8 is 3 and so…
 */

import java.util.*;
public class ReplaceRank{

    public static int[] printRanks(int arr[]){
        // Step1 -> create a copy array
        int copyArray[] = arr.clone();

        // Step 2 -> Sort the copy Array
        Arrays.sort(copyArray);

        // Step 3 -> Create a HashMap and a temp variable to store the rank of each element 
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = 1;

        for(int i=0;i<copyArray.length;i++){
            if(!map.containsKey(copyArray[i])){
                map.put(copyArray[i], temp++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }

    public static void main(String args[]){
        int arr[] = {20, 15, 26, 2, 98, 6};

        int[] rankedArr = printRanks(arr);

        // Print the ranked array
        for (int rank : rankedArr) {
            System.out.print(rank + " ");
        }
    }
}