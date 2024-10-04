/*
 * Prime Numbers in a given range
Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

Examples:

Examples:
Input: 2 10
Output: 2 3 5 7 
Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

Example 2:
Input: 10 16
Output: 11 13 
Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.
 */

import java.util.*;

public class PrimeInRange{
    public static boolean isPrime(int n){
        if(n <=1){
            return false;
        }else if(n == 2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeInRange(int min, int max){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        printPrimeInRange(min, max);

        sc.close();
    }
}