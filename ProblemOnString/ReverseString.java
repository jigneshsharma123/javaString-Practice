package ProblemOnString;

/**
 * ReverseString
 */
public class ReverseString {
       public static String stringReverse(char[] arr) {

        StringBuilder output = new StringBuilder();
        for(int i = arr.length - 1; i >=0; i--) {
            output.append(arr[i]);
        }
        return output.toString();
       }
    public static void main(String[] args) {
    
    }
}