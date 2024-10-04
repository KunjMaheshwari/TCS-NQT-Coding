import java.util.*;

public class RemoveBrackets {
    public static void printSolution(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != '(' && ch != ')'){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSolution(str);
    }
}
