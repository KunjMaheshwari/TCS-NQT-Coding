import java.util.*;


public class Count {
    public static void printSolution(String str){
        int length = str.length();

        int vowels = 0, consonant = 0, spaces = 0;
        str = str.toLowerCase();

        for(int i=0;i<length;i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if(ch >= 'a' && ch <= 'z'){
                consonant ++;
            }else if(ch == ' '){
                spaces++;
            }
        }
        System.out.println("Vowels "+ vowels);
        System.out.println("Consonants: "+ consonant);
        System.out.println("Spaces "+ spaces);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSolution(str);
    }
}
