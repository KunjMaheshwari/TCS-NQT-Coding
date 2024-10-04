import java.util.*;

public class HarshadNumber {

    public static boolean isHarshad(int n){
        int originalNumber = n;
        int sum = 0;

        while(n != 0){
            int lastDigit = n%10;
            sum += lastDigit;
            n = n/10;
        }
        if(originalNumber % sum == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        boolean result = isHarshad(n);
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
