/*
 * Sort Elements of an Array by Frequency
 * 
 * Problem Statement: Given an array of integers, having some duplicate
 * elements, sort the array by frequency.
 * 
 * Examples:
 * 
 * Example 1:
 * Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
 * Output: 2 2 2 1 1 3 3 4
 * Explanation: Since 2 is present 3 times in an array , so print it 3 times
 * ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it
 * will be printed at last.
 * 
 * Example 2:
 * Input: N = 6, array[] = {-199,6,7,-199,3,5}
 * Output: -199 -199 3 5 6 7
 * Explanation: Since -199 is present 2 times so it will be printed at first ,
 * then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted
 * order.
 */

import java.util.*;

public class SortElementsFrequency {
    public static ArrayList<Integer> printSortedFrequencyElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> newArr = new ArrayList<>();
        for (int num : arr) {
            newArr.add(num);
        }

        Collections.sort(newArr, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int freqA = map.get(a);
                int freqB = map.get(b);

                if(freqA != freqB){
                    return freqB - freqA;
                }else{
                    return a-b;
                }
            }
        });
        return newArr;
    }
    public static void main(String args[]) {

    }
}