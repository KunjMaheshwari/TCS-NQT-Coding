/*
 * Maximum Product Subarray in an Array
 * Problem Statement: Given an array that contains both negative and positive
 * integers, find the maximum product subarray.
 * 
 * Examples
 * Example 1:
 * Input:
 * 
 * Nums = [1,2,3,4,5,0]
 * Output:
 * 
 * 120
 * Explanation:
 * 
 * In the given array, we can see 1×2×3×4×5 gives maximum product value.
 * 
 * 
 * Example 2:
 * Input:
 * Nums = [1,2,-3,0,-4,-5]
 * Output:
 * 
 * 20
 * Explanation:
 * 
 * In the given array, we can see (-4)×(-5) gives maximum product value.
 */

import java.util.*;

public class MaximumProduct {

    public static int printKadansAlgorithm(int arr[]){
        int maxProduct = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < 0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(arr[i], arr[i]*currMax);
            currMin = Math.min(arr[i], currMin * arr[i]);
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(printKadansAlgorithm(arr));

        sc.close();
    }
}