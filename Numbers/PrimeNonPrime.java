/*
 * Check if a number is prime or not
Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

Examples
Example 1:
Input:N = 2
Output:True
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
Example 2:
Input:N =10
Output: False
Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.
 */

import java.util.*;

public class PrimeNonPrime {
    public static boolean isPrime(int N) {
        if(N == 2 || N == 1){
            return true;
        }
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(isPrime(N));
        sc.close();
    }
}
