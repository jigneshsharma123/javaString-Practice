package ProblemOnString.reverseEachWord;

public class Solution {
  public static String reverseWord(String str) {
    StringBuilder output = new StringBuilder();
    if(str.length() == 1) {
        output.append(str);
    } 
    
    
    return output.toString();
  }
    public static String reverseEachWord(String str) {
       String word[] = str.split(" ");
       for(int i = 0; i < str.length(); i++) {
         String output =  reverseWord(word[i]);
       }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(reverseEachWord( "Hello I am Aadil"));
    }
}
