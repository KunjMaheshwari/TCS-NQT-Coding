import java.util.*;

public class SumInRange {
    public static int printSolution(int n, int m){
        int sum = 0;
        for(int i=n;i<=m;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(printSolution(n, m));
    }
}
