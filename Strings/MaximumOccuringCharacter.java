import java.util.*;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str = "Apple";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        int maxCount = 0;
        char maxCharacter = ' ';

        for(char ch : map.keySet()){
            int count = map.get(ch);
            if(count > maxCount){
                maxCount = count;
                maxCharacter = ch;
            }
        }
        System.out.println(maxCharacter);
    }
}