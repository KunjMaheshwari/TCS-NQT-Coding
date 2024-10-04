import java.util.*;

public class SumofNumbers {
    public static int printSolution(String str){
        String tempSum = "0";
        int sum = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                tempSum += ch;
            }
            else{
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }
        return sum + Integer.parseInt(tempSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(printSolution(str));

        sc.close();
    }
}
