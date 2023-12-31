package ProblemOnString.removeDuplicates;

public class Solution {
    public static boolean isPresent(StringBuilder str, char x) {
        if(str.length() == 0) {
            return true;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == x) {
                return true;
            }
        }
         
        return false;
    }
    public static String removeDuplicates(String str) {
        
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(!isPresent(output, str.charAt(i))) {
               output.append(str.charAt(i));
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabccbaa"));
    }
}
