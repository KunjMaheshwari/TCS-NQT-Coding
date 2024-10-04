import java.util.*;

public class Reverse {
    public static void printSoltion(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();

        printSoltion(str);
    }
}
