package ProblemOnString;

public class WordWiseReverse {

    public static String reverseWordWise(String str) {
        // hello world 
        // world hello
        StringBuffer output = new StringBuffer();
        String[] word = str.split(" ");
       
        for(int i  = word.length - 1; i >= 0; i--) {
            output.append(word[i]);
        }
         return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordWise("Welcome to Coding ninjas"));
    }
}
