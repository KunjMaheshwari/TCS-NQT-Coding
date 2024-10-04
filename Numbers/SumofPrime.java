
import java.util.*;

public class SumofPrime {
    public static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        if(n  == 2){
            return true;
        }

        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean prime(int n){
        for(int i=2;i<=n/2;i++){
            if(isPrime(i) && isPrime(n-i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        if(prime(input)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
