package ProblemOnString;

public class SubString {

    public static void printSubString(String str) {
        int len = str.length();
       for(int i = 0; i < len; i++) {
        for(int j = i + 1; j < len + 1; j++) {
            System.out.println(str.substring(i, j));
        }
       }
       return;
    }
    public static void main(String[] args) {
      String x = "abc";
      printSubString(x);
    }
}
