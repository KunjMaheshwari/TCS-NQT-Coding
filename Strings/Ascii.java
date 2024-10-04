import java.util.*;

public class Ascii {
    public static int printSolution(String str){
        char ch = str.charAt(0);
        int result = ch;
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(printSolution(str));
    }
}
