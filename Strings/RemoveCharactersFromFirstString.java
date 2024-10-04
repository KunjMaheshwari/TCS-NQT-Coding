import java.util.*;

public class RemoveCharactersFromFirstString {
    public static String printSolution(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str1.length();i++){
            int flag = 0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    flag = 1;
                }
            }
            if(flag != 1){
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
