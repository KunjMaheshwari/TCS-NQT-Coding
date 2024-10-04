package Strings;
import java.util.*;

public class Anagram {
    public static String SortString(String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        str1 = SortString(str1);
        str2 = SortString(str2);

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        System.out.println(isAnagram(str1, str2));
    }
}
