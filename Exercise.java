import java.util.*;

public class Exercise {
    public static int printSolution(int durations[]){
        int total = 0;
        int size = durations.length;

        for(int i=0;i<durations.length;i++){
            total += durations[i];
        }

        return total/size;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int N  = sc.nextInt();
        int durations[] = new int[N];

        for(int i=0;i<N;i++){
            durations[i] = sc.nextInt();
        }

        System.out.println(printSolution(durations));
        sc.close();
    }
}
