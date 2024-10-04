import java.util.*;

public class Palindrome {
    public static void printPalindrome(int N){
        boolean isPalindrome = false;
        int reversedNumber = 0;
        int originalNumber = N;

        while(N > 0){
            int lastDigit = N%10;
            reversedNumber = reversedNumber*10 + lastDigit;
            N = N/10;
        }

        if(reversedNumber == originalNumber){
            isPalindrome = true;
        }

        if(isPalindrome){
            System.out.println("Palindrome numbers");
        }else{
            System.out.println("Not a palindrom numeber");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        printPalindrome(N);

        sc.close();
    }
}