import java.util.*;

public class WordsSplit{
    public static void countFrequency(String str){
        String words[] = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1)+" "+ count+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        countFrequency(str);
    }
}