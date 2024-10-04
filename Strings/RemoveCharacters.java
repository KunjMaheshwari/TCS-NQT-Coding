import java.util.*;

public class RemoveCharacters {
    public static void printSolution(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int ascii = (int)str.charAt(i);

            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                sb.append(str.charAt(i));
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