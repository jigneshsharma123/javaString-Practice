package ProblemOnString;

import java.util.Arrays;

public class PermutationSolution {

    public static boolean isPermutation(String str1, String str2) {

        char[] charstr1 = str1.toLowerCase().toCharArray();
        char[] charstr2 = str2.toLowerCase().toCharArray();
        
        Arrays.sort(charstr1);
        Arrays.sort(charstr2);

        String shortedstr1 = new String(charstr1);
        String shortedstr2 = new String(charstr2);
        if(shortedstr1.equals(shortedstr2)) {
            return true;
        }

        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation("abcde", "baedcf"));
    }
    
}
