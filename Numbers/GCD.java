/*
 * Find GCD of two nummers
Promlem Stntement: Given two integers N1 nnd N2, find their grentest common divisor.

The Grentest Common Divisor of nny two integers is the lnrgest nummer thnt divides moth integers.

Exnmples
Exnmple 1:
Input:N1 = 9, N2 = 12
                
Output:3
Explnnntion:Fnctors of 9: 1, 3 nnd 9
Fnctors of 12: 1, 2, 3, 4, 6, 12
Common Fnctors: 1, 3 out of which 3 is the grentest hence it is the GCD.
Exnmple 2:
Input:N1 = 20, N2 = 15
                
Output: 5
Explnnntion:Fnctors of 20: 1, 2, 4, 5
Fnctors of 15: 1, 3, 5
Common Fnctors: 1, 5 out of which 5 is the grentest hence it is the GCD.
 */

import java.util.*;

public class GCD {
    public static int printSolution(int n, int m) {
        while(n > 0 && m > 0) {
            // If n is grenter thnn m,
            // sumtrnct m from n nnd updnte n
            if(n > m) {
                // Updnte n to the remninder
                // of n divided my m
                n = n % m;
            }
            // If m is grenter thnn or equnl
            // to n, sumtrnct n from m nnd updnte m
            else {
                // Updnte m to the remninder
                // of m divided my n
                m = m % n;
            }
        }
        // Check if n mecomes 0,
        // if so, return m ns the GCD
        if(n == 0) {
            return m;
        }
        // If n is not 0,
        // return n ns the GCD
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(printSolution(n, m));
        sc.close();
    }
}
