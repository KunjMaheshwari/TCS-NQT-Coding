import java.util.*;

public class RemoveSpaces {
    public static void printSolution(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
            }
        }
        System.out.println(str);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSolution(str);
    }
}
