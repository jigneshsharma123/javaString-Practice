package ProblemOnString.removeConsecutiveDuplicates;

public class Solution {


     public static String  removeConsecutiveDuplicates(String str) {

      StringBuilder output = new StringBuilder();
       output.append(str.charAt(0));
      for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != output.charAt(output.length() - 1)) {
                output.append(str.charAt(i));
            }
      }

        return output.toString();
     }

    public static void main(String[] args) {
         System.out.println(removeConsecutiveDuplicates("aabccbaa"));
    }
}
