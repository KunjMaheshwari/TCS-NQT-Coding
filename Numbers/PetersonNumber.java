/*
 * Peterson Number or Strong Number - Sum of factorial of digits should be equal to the number itself.
 * Example - 145
 */

import java.util.*;
public class PetersonNumber {
    public static int printFactorial(int n){
        if(n == 0 || n ==1){
            return n;
        }
        return (n*printFactorial(n-1));
    }
    public static void printSolution(int n){
        int originalNumber = n;
        int sum = 0;
        int d = 0;
        while(n != 0){
            d = n%10;
            sum += printFactorial(d);
            n = n/10;
        }
        if(sum == originalNumber ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSolution(n);

        sc.close();
    }
}
