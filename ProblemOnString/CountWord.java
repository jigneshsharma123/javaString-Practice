package ProblemOnString;

import java.util.Scanner;

public class CountWord {

   public static int countWords(String str) {

    int len = str.length();
    int count = 1; 
    for(int i = 0; i < len; i++) {
        if(str.charAt(i) == ' ') {
            count++;
        }
    }

    return count;

   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
    }
}
