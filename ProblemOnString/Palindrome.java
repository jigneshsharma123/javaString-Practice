package ProblemOnString;
import java.util.*;
public class Palindrome {

    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9 ]", "");
        str  = str.toLowerCase();
      StringBuffer st = new StringBuffer();
      for(int i = str.length() - 1 ; i>=0; i--) {
        st.append(str.charAt(i));
      }
      String reverseStr = st.toString();
      if(str.equals(reverseStr)) {
        return true;
      }
        return false;
    }
    public static void main(String[] args) {
        boolean output = checkPalindrome("5?36@6?35@");
        System.out.println(output);
    }
}
/*
 6
c1 O$d@eeD o1c
N2 i&nJA?a& jnI2n
A1b22Ba
codingninjassajNiNgNidoc
5?36@6?35
aaBBa@

*/ 


